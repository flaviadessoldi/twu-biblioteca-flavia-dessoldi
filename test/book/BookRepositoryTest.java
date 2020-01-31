package book;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import repository.BookRepository;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class BookRepositoryTest {


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
    public void shouldShowBookList(){

        BookRepository bookRepository = new BookRepository();

        bookRepository.printBookList();

       assertThat(outContent.toString(), containsString("Harry Potter"));

    }
}