package com.chamber.ChamberMovies.dto;

public class ScoreDTO {
	
	private Long movieID;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public Long getMovieId() {
		return movieID;
	}

	public void setMovieId(Long movieID) {
		this.movieID = movieID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}


	
	
	
}
