package com.kata.cinemar.controller.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kata.cinemar.controller.interfaces.IMovieService;
import com.kata.cinemar.model.db.entities.Movie;
import com.kata.cinemar.model.db.repository.MovieRepository;
@Service
public class MovieServiceImpl implements IMovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public String addNewMovie(Movie movie) {
		
		movieRepository.save(movie);
		return "Movie added!";
	}
}
