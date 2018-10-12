package com.stackroute.movieservice.domain;

import org.apache.catalina.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    int id;
    String movieName;
    String movieReview;
    int movieRating;

    public Movie(){
    }

    public Movie(int id, String movieName, String movieReview, int movieRating){
        this.id = id;
        this.movieName = movieName;
        this.movieReview = movieReview;
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieReview='" + movieReview + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(String movieReview) {
        this.movieReview = movieReview;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}
