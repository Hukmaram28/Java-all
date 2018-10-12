package com.stackroute.movieservice.service;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.movieservice.exceptions.MovieNotFoundException;

import java.util.List;

public interface MovieService {

    public Movie saveMovie(Movie movie) throws MovieAlreadyExistsException;
    public List<Movie> getAllMovies();
    public Movie getMovie(int id) throws MovieNotFoundException;
    public List<Movie> findMovieByName(String movieName);

    public void deleteMovie(int id)throws MovieNotFoundException;
    public void updateMovie(Movie movie, int id) throws MovieNotFoundException;

}
