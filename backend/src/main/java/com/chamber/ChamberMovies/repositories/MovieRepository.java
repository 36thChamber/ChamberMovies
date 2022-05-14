package com.chamber.ChamberMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamber.ChamberMovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
