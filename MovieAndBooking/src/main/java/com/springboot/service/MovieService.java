package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.domain.Movie;
import com.springboot.repository.MovieRepository;
@Service
public class MovieService {
	
	
	private final MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
}
