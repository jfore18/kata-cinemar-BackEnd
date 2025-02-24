package com.kata.cinemar.controller.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kata.cinemar.controller.interfaces.IMovieService;
import com.kata.cinemar.model.db.entities.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private IMovieService movieService;
	
	@PostMapping("/new-movie")
	public ResponseEntity<String> addNewMovie (@RequestBody Movie movie){
		String result = movieService.addNewMovie(movie);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
	@GetMapping("/all-movies")
	public ResponseEntity<List<Movie>> getAllMovies(){
		List<Movie> movies = movieService.getAllMovies();
		return ResponseEntity.status(HttpStatus.OK).body(movies);
	}
	

}
