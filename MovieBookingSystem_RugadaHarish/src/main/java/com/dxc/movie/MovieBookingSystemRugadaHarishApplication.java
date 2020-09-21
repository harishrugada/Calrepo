package com.dxc.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class MovieBookingSystemRugadaHarishApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemRugadaHarishApplication.class,args);
	}
	@Bean

	 public RestTemplate getRestTemplate() {


	 return new RestTemplate();



	 }
}
