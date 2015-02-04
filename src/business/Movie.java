package business;

import it.jtomato.gson.AbridgedCast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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


	public String getSynopsis() {
		return this.movie.synopsis;
	}

	public String getRuntime() {
		return this.movie.runtime;
	}
	
	public String getAudienceRating() {
		return this.movie.rating.audienceRating;
	}
	
	public int getAudienceScore() {
		return this.movie.rating.audienceScore;
	}
	
	public String getCriticsRating() {
		return this.movie.rating.criticsRating;
	}
	
	public int getCriticsScore() {
		return this.movie.rating.criticsScore;
	}
	public String getMpaaRating() {
		return this.movie.mpaaRating;
	}
	public List<String> getGenre() {
		return this.movie.genres;
	}
	public List<String> getAbridgedCast() {
		List<String> cast = new ArrayList<String>(); 
		for (int i = 0; i < this.movie.abridgedCast.size(); i++){ 
		cast.add(this.movie.abridgedCast.get(i).name);
		}
		return cast;
	}
	
}
