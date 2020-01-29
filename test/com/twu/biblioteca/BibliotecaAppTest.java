package com.twu.biblioteca;

import book.BookList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class BibliotecaAppTest {

    BibliotecaApp bibliotecaApp = new BibliotecaApp();

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


        bibliotecaApp.welcomeMessage("Welcome to Biblioteca!");

        assertEquals(outContent.toString(), "Welcome to Biblioteca!");

    }

    @Test

    public void shouldShowMenuOptions(){
        bibliotecaApp.showMenuOptions();

        assertThat(outContent.toString(), containsString("1 - List books"));


    }

    @Test
    public void shouldSelectCorrectOption(){

        bibliotecaApp.chooseOption(1);

        assertThat(outContent.toString(), containsString("Author"));


    }

    @Test
    public void shouldShowMessageWhenChooseInvalidOption(){

        bibliotecaApp.chooseOption(8);

        assertThat(outContent.toString(), containsString("Select a valid option!"));


    }






}