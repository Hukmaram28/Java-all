package com.stackroute.movieservice.service;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.movieservice.exceptions.MovieNotFoundException;
import com.stackroute.movieservice.repository.MovieRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MovieServiceTest {

    Movie movie;

    @Mock
    MovieRepository movieRepository;

    @InjectMocks
    MovieServiceImpl movieService;
    List<Movie> list= null;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        movie = new Movie();
        movie.setId(10);
        movie.setMovieName("Batman");
        movie.setMovieReview("nice");
        movie.setMovieRating(6);
        list = new ArrayList<>();
        list.add(movie);


    }

    @Test
    public void saveMovieTestSuccess() throws MovieAlreadyExistsException {

        when(movieRepository.save((Movie)any())).thenReturn(movie);
        Movie savedMovie = movieService.saveMovie(movie);
        Assert.assertEquals(movie,savedMovie);

        verify(movieRepository,times(1)).save(movie);

    }

    @Test(expected = MovieAlreadyExistsException.class)
    public void saveMovieTestFailure() throws MovieAlreadyExistsException {
        when(movieRepository.save((Movie)any())).thenReturn(null);
        Movie savedMovie = movieService.saveMovie(movie);
        System.out.println("savedMovie" + savedMovie);
        Assert.assertEquals(movie,savedMovie);
    }

    @Test
    public void getAllMovie(){

        movieRepository.save(movie);
        when(movieRepository.findAll()).thenReturn(list);
        List<Movie> movielist = movieService.getAllMovies();
        Assert.assertEquals(list,movielist);

    }
    @Test
    public void testSearchMovie(){
        when(movieRepository.findAll()).thenReturn(list);
        Movie mov1 = new Movie(9,"Venom","cool",3);
        movieRepository.save(mov1);
        Movie fetchmovie = movieRepository.findBymovieName(mov1.getMovieName()).get(0);
        Assert.assertEquals(9 , fetchmovie.getId());
    }

    @Test
    public void testDeleteMovie(){
        when(movieRepository.findAll()).thenReturn(list);
        movieRepository.save(movie);
        movieRepository.delete(movie);
        Assert.assertEquals(Optional.empty(),movieRepository.findById(movie.getId()));
    }
}
