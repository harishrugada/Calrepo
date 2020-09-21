package com.dxc.movie.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.movie.entity.Movie;



public interface IRepository extends JpaRepository<Movie, Integer>{
	
	

}
