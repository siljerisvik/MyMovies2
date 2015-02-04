package tests;

import static org.junit.Assert.*;
import it.jtomato.JTomato;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import business.Movie;
import repository.WebRepository;

public class TestsRepository {
	private WebRepository repo;
	private NetHttpClientMockUp httpClient = new NetHttpClientMockUp();
	
	@Before
	public void setUp() throws Exception {		
		repo = new WebRepository(new JTomato("", httpClient));
	}
	
	@Test
	public void getBoxOfficeMovies_ReturnsOneMovie() {
		httpClient.setResponse(JsonResult.jsonBoxOfficeMovies);
		ArrayList<Movie> movies = repo.getBoxOfficeMovies(5);
		assertEquals(movies.size(), 1);
		assertEquals("Harry Potter and the Deathly Hallows - Part 2", movies.get(0).getTitle());
	}
	
	@Test
	public void searchMovies_ReturnsOneMovie() {
		httpClient.setResponse(JsonResult.jsonMovieSearch);
		ArrayList<Movie> movies = repo.searchMovie("something");
		assertEquals(10, movies.size());		
	}
	
	@Test
	public void searchMovies_ReturnsTitle() {
		httpClient.setResponse(JsonResult.jsonBoxOfficeMovies);
		ArrayList<Movie> movies = repo.getBoxOfficeMovies(10);
		assertEquals(1, movies.size());
	}
	
	@Test
	public void getSOMETHING() {
		httpClient.setResponse(JsonResult.jsonMovieSearch);
		ArrayList<Movie> movies = repo.searchMovie("the matrix");
		assertEquals("The Matrix", movies.get(0).getTitle());
		assertEquals(87, movies.get(0).getCriticsScore());
		assertEquals("1999", movies.get(0).getYear());
	}
	
}
