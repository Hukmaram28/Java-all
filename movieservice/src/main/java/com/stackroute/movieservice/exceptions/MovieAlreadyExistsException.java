package com.stackroute.movieservice.exceptions;

import com.stackroute.movieservice.domain.Movie;

public class MovieAlreadyExistsException extends Exception{

    private String message;

    public MovieAlreadyExistsException() {}

    public MovieAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }


}
