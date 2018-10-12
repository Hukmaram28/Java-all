package com.stackroute.movieservice.repository;

import com.stackroute.movieservice.domain.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataMongoTest
public class MovieRepositoryTest {

    @Autowired
    MovieRepository movieRepository;
    Movie movie;

    @Before
    public void setUp()
    {
        movie = new Movie();
        movie.setId(10);
        movie.setMovieName("Batman");
        movie.setMovieReview("nice");
        movie.setMovieRating(6);
    }
    @Test
    public void testSaveMovie(){
        movieRepository.save(movie);
        Movie fetchMovie = movieRepository.findById(movie.getId()).get();
        Assert.assertEquals(10,fetchMovie.getId());

    }

    @Test
    public void testSaveMovieFailure(){
        Movie testMovie = new Movie(10,"Batman","nice",6);
        movieRepository.save(movie);
        Movie fetchMovie = movieRepository.findById(movie.getId()).get();
        Assert.assertNotSame(movie,fetchMovie);
    }

    @Test
    public void testGetAllMovie(){
        Movie mov1 = new Movie(9,"Venom","nice",3);
        Movie mov2 = new Movie(8,"Superman","awesome",5);
        movieRepository.save(mov1);
        movieRepository.save(mov2);

        List<Movie> list = movieRepository.findAll();
        Assert.assertEquals("Venom",list.get(0).getMovieName());

    }
    @Test
    public void testSearchMovie(){
        Movie mov1 = new Movie(9,"Venom","nice",3);
        Movie mov2 = new Movie(8,"Superman","awesome",5);
        movieRepository.save(mov1);
        Movie fetchmovie = movieRepository.findById(mov1.getId()).get();
        Assert.assertEquals(9 , fetchmovie.getId());
    }

    @Test
    public void testDeleteMovie(){
        movieRepository.save(movie);
        movieRepository.delete(movie);
        Assert.assertEquals(Optional.empty(),movieRepository.findById(movie.getId()));
    }
}


