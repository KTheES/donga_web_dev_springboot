package com.springboot.repository;

import java.util.*;


import com.springboot.domain.Movie;

public interface MovieRepository {
	List<Movie> findAll();
	Movie findById(int movieId);


}
