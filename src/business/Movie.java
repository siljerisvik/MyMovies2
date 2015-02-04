package business;

import java.io.IOException;

import org.jsoup.Jsoup;

import it.jtomato.gson.Rating;

public class Movie {
	
	private it.jtomato.gson.Movie movie;
	
	public Movie(it.jtomato.gson.Movie movie) {
		this.movie = movie;		
	}
	
	public String getTitle(){
		return this.movie.title;
	}
	
	public String getId(){
		return this.movie.id;
	}

	public String getYear() {
		return this.movie.year;
	}

	public int getRating() {
		return this.movie.rating.criticsScore;
	}

	public String getSynopsis() {
		return this.movie.synopsis;
	}

	public String getRuntime() {
		return this.movie.runtime;
	}
	
	public String getCriticsRating() {
		return this.movie.rating.criticsRating;
	}
	
	public int getCriticsScore() {
		return this.movie.rating.criticsScore;
	}

}
