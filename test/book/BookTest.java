package book;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class BookTest {

    @Test

    public void shouldCreateBook(){
        Book book1 = new Book ("Harry Potter", "JK Rowling", "1998");

        assertThat(book1, is(new Book("Harry Potter", "JK Rowling", "1998")));
    }

}