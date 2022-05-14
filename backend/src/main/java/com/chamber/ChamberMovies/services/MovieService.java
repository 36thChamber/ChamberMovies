package com.chamber.ChamberMovies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chamber.ChamberMovies.dto.MovieDTO;
import com.chamber.ChamberMovies.entities.Movie;
import com.chamber.ChamberMovies.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional
	public Page<MovieDTO> findALL(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional
	public MovieDTO findById(Long id) {
		Movie result = repository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}

