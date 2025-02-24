package com.kata.cinemar.controller.interfaces;

import java.util.List;

import com.kata.cinemar.model.db.entities.Movie;

public interface IMovieService {
	
	public List<Movie>getAllMovies();
	public String addNewMovie(Movie movie);

}
