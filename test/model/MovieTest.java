package model;

import model.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
   public void shouldCreateMovie(){
        Movie movie = new Movie(true, "Moulin Rouge", 1998, "Baz Luhrman", 8);

        assertEquals("Moulin Rouge", movie.getTitle());
        assertEquals(1998, movie.getYear());
    }
}