package tests;

import static org.junit.Assert.*;
import it.jtomato.gson.Rating;

import org.junit.Test;

import business.Movie;

public class TestsMovie {

	@Test
	public void getTitle_GetsCorrectTitle() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.title = "Pelle";
		Movie movie = new Movie(m);
		assertEquals("Pelle", movie.getTitle());		
	}
	
	@Test
	public void getId_getsCorrectId() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.id = "123";
		Movie movie = new Movie(m);
		assertEquals("123", movie.getId());		
	}
	
	@Test
	public void getYear_getsCorrectYear() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.year = "1998";
		Movie movie = new Movie(m);
		assertEquals("1998", movie.getYear());
	}
	
	@Test
	public void getSynopsis_getsCorrectSynopsis() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		String testString = "The dude is awesome, but his rug is stolen by someone, after Woo - the chinaman - pees on it. Fuck it, let's go bowling";
		m.synopsis = testString;
		Movie movie = new Movie(m);
		assertEquals(testString, movie.getSynopsis());
	}
	
	@Test
	public void getRating_getsCorrectRating() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.rating = new Rating();
		m.rating.criticsScore = 100;
		Movie movie = new Movie(m);
		assertEquals(100, movie.getRating());
	}
	
	@Test
	public void getRuntime_getsCorrectRuntime() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.runtime = "119";
		Movie movie = new Movie(m);
		assertEquals("119", movie.getRuntime());
	}

}
