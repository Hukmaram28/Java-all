package com.stackroute.movieservice.Controller;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.movieservice.exceptions.MovieNotFoundException;
import com.stackroute.movieservice.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class MovieController {

    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        ResponseEntity responseEntity;
        try{
            movieService.saveMovie(movie);
            responseEntity = new ResponseEntity<String>("Successfully Created", HttpStatus.CREATED);
        }catch (MovieAlreadyExistsException e){
            responseEntity = new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }

    @GetMapping("/movie")
    public ResponseEntity<?>getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(),HttpStatus.OK);
    }

    @GetMapping("movie/{id}")
    public Movie getMovie(@PathVariable int id){

        Movie movie = new Movie();

        try{
            movie = movieService.getMovie(id);
        }
        catch(MovieNotFoundException e ) {
            e.printStackTrace();
        }

        return movie;
    }

    @PutMapping(value = "movie/{id}")
    public void updateMovies(@RequestBody Movie movie, @PathVariable int id){
        try{
            movieService.updateMovie(movie,id);
        }
        catch(MovieNotFoundException e ) {
            e.printStackTrace();
        }
    }


    @DeleteMapping(value = "movie/{id}")
    public void deleteMovies(@PathVariable int id){
        try{
            movieService.deleteMovie(id);
        }
        catch(MovieNotFoundException e ) {
            e.printStackTrace();
        }
    }

};