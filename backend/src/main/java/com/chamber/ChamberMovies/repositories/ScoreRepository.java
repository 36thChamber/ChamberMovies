package com.chamber.ChamberMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamber.ChamberMovies.entities.Score;
import com.chamber.ChamberMovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
