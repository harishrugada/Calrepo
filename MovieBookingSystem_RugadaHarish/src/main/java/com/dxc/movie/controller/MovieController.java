package com.dxc.movie.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.movie.entity.ErrorResponse;
import com.dxc.movie.entity.Movie;
import com.dxc.movie.service.IService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@ApiOperation(value="/mv",tags="Movie Application")
@Controller
@RestController
@RequestMapping(path="/mvbm")
public class MovieController {
	
	@Autowired
	Movie movie;
	
	@Autowired
	IService service;
	
	
	
	@ApiResponses(value = {
		
		@ApiResponse(code=200,message="SUCCESS",response = Movie.class),
		@ApiResponse(code=401,message="UNAUTHORIZED",response = ErrorResponse.class),
		@ApiResponse(code=403,message="FORBIDDEN",response = ErrorResponse.class),
		@ApiResponse(code=404,message="RESOURCE NOT FOUND",response = ErrorResponse.class),

		
		})
	
	@ApiOperation(value="Add Movie details",produces = "json data" , response = Movie.class)
	@PostMapping(path="/add")
	public Movie update(@RequestBody Movie movie) {
		return service.addMovie(movie);
	}
	@GetMapping(path="/movies")
	public List<Movie> getAllMovies(){
		
		return service.getAllMovies();
	}
	
	
	@DeleteMapping(path="/delete/{movie_id}")
	public java.lang.String delete(@PathVariable("movie_id") int movie_id) {
		service.deleteMovie(movie_id);
		return "movie deleted with movie_id"+movie_id;
	}

}
