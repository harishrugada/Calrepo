package com.dxc.movie.service;

import java.util.List;

import com.dxc.movie.entity.Movie;



public interface IService {
	public Movie addMovie(Movie movie);
	
	public void deleteMovie(int movie_id);
	
	public List<Movie> getAllMovies();

	

}
