package model;

import model.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class BookTest {

    @Test

    public void shouldCreateBook(){

        Book book = new Book(true,"Harry Potter", "JK Rowling", "1998");

        assertNotNull(book);
    }

}