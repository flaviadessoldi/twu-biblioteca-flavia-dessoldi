package book;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookListTest {


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

        BookList bookList = new BookList();

        Book book1 = new Book (1, "Harry Potter", "JK Rowling", "1998");

        List<Book> listBook = Arrays.asList(book1);

        bookList.printBookList(listBook);


       assertThat(outContent.toString(), containsString("Harry Potter"));

    }
}
