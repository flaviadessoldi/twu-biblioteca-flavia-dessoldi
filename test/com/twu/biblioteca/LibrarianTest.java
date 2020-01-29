package com.twu.biblioteca;

import book.BookList;
import librarian.Librarian;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LibrarianTest {

    Librarian lb = new Librarian();

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
    public void shouldSelectCorrectOption(){

        lb.chooseOption(1);

        assertThat(outContent.toString(), containsString("Author"));


    }

    @Test
    public void shouldShowMessageWhenChooseInvalidOption(){

        lb.chooseOption(8);

        assertThat(outContent.toString(), containsString("Select a valid option!"));

    }


    @Test
    public void shouldQuitApplicationWhenChooseZero(){

       lb.chooseOption(0);

        System.exit(0);


    }






}