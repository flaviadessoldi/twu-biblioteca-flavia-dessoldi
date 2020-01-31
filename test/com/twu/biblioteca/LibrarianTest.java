package com.twu.biblioteca;

import book.Book;
import librarian.Librarian;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class LibrarianTest {

    Librarian lb = new Librarian();
    Book bk = new Book();

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
    public void shouldShowWelcomeMessage(){


        lb.welcomeMessage("Welcome to Biblioteca!");

        assertEquals(outContent.toString(), "Welcome to Biblioteca!");

    }

    @Test

    public void shouldShowMenuOptions(){
        lb.showMenuOptions();

        assertThat(outContent.toString(), containsString("1 - List books"));


    }

    @Test
    public void shouldSelectCorrectOption() throws IOException {

        lb.chooseOption(1);

        assertThat(outContent.toString(), containsString("Author"));


    }

    @Test
    public void shouldShowMessageWhenChooseInvalidOption() throws IOException {

        lb.chooseOption(8);

        assertThat(outContent.toString(), containsString("Select a valid option!"));

    }


    @Test
    public void shouldQuitApplicationWhenChooseZero() throws IOException {

       lb.chooseOption(0);

        System.exit(0);

    }

    @Test
    public void shouldCheckoutBook() throws IOException {


        lb.checkoutBook();


        assertThat(outContent.toString(), containsString("checked out!"));
    }

        @Test
        public void shouldCheckoutMovie() throws IOException {


            lb.checkoutMovie();



            assertThat(outContent.toString(), containsString("The movie has been checked out!"));

        }






}