package com.dxc.movie.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RestTemplateDemo {
	
	@Autowired
	RestTemplate  restTemplate;
	
	@RequestMapping(value = "/template/movies")
	   public ResponseEntity<List> getAllMovies() {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	   
	      
	      
	      	return	restTemplate.getForEntity("http://localhost:7755/mvbm/movies",List.class);
	      
	   }
	
	

}
