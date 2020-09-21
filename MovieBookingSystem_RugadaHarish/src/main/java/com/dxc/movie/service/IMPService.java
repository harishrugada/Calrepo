package com.dxc.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.movie.entity.Movie;
import com.dxc.movie.repository.IRepository;
@Service
public class IMPService implements IService {
	
	@Autowired
	IRepository repo;
	@Autowired
	Movie mv;

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public void deleteMovie(int movie_id) {
		// TODO Auto-generated method stub
		repo.deleteById(movie_id);

	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

}
