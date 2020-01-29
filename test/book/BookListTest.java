package book;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookListTest {

    @Test
    public void shouldShowBookList(){

        BookList bookList = new BookList();

        Book book1 = new Book ("Harry Potter", "JK Rowling", "1998");

        List<Book> listBook = Arrays.asList(book1);


       assertNotNull(listBook);

    }
}