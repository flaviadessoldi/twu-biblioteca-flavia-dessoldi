package movie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import repository.MovieRepository;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class MovieRepositoryTest {

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @Test
    public void shouldShowMovieList(){

        MovieRepository movieRepository = new MovieRepository();

        movieRepository.printMovieList();

        assertThat(outContent.toString(), containsString("Moulin Rouge"));

    }

}