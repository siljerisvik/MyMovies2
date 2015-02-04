package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.jtomato.gson.AbridgedCast;
import it.jtomato.gson.Rating;

import org.junit.Test;

import business.Movie;

public class TestsMovie {
	
	@Test
	public void constructor_NoArgs_ObjectExists() {
		Movie movie = new Movie(new it.jtomato.gson.Movie());
		assertNotNull(movie);	
	}

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
	public void getCriticsScore_getsCorrectRating() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.rating = new Rating();
		m.rating.criticsScore = 100;
		Movie movie = new Movie(m);
		assertEquals(100, movie.getCriticsScore());
	}
	
	@Test
	public void getRuntime_getsCorrectRuntime() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.runtime = "119";
		Movie movie = new Movie(m);
		assertEquals("119", movie.getRuntime());
	}
	
	@Test
	public void getAudienceRating_returnsCorrect() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.rating = new Rating();
		m.rating.audienceRating = "Awesome";
		Movie movie = new Movie(m);
		assertEquals("Awesome", movie.getAudienceRating());
		
	}
	
	@Test
	public void getAudienceScore_returnsCorrect() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.rating = new Rating();
		m.rating.audienceScore = 99;
		Movie movie = new Movie(m);
		assertEquals(99, movie.getAudienceScore());
	}
	
	@Test
	public void getMpaaRating_returnsCorrect() {
		it.jtomato.gson.Movie m =new it.jtomato.gson.Movie();
		m.mpaaRating = "Adults only";
		Movie movie = new Movie(m);
		assertEquals("Adults only", movie.getMpaaRating());
	}
	
	@Test
	public void getGenre_returnsCorrect() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		List<String> test = new ArrayList<String>();
		test.add("Action");
		test.add("Sports");
		m.genres = test;
		Movie movie = new Movie(m);
		assertEquals(Arrays.asList("Action", "Sports"), movie.getGenre());
	}
	@Test
	public void getAbridgedCast_returnsCorrect() {
		it.jtomato.gson.Movie m = new it.jtomato.gson.Movie();
		m.abridgedCast = new ArrayList<AbridgedCast>();
		AbridgedCast cast = new AbridgedCast();
		cast.name = "Per Robert";
		AbridgedCast cast2 = new AbridgedCast();
		cast2.name = "Svein Are";
		m.abridgedCast.add(cast);
		m.abridgedCast.add(cast2);
		Movie movie = new Movie(m);
		assertEquals(Arrays.asList("Per Robert","Svein Are"), movie.getAbridgedCast());
		
	}
	
}
