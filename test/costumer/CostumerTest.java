package costumer;

import book.Book;
import movie.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CostumerTest {

    @Test
    public void shouldCreateMovie(){

        Book b = new Book(true,"Harry Potter", "JK Rowling", "1998");

        Costumer costumer = new Costumer("Flavia", "123-1234", "banana", new ArrayList<>(Arrays.asList(b)));

        assertEquals(costumer.getName(), "Flavia");
    }

}