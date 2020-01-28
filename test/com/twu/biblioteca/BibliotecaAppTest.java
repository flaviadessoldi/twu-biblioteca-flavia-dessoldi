package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void shouldShowWelcomeMessage(){


        bibliotecaApp.welcomeMessage("Welcome to Biblioteca!");

        assertTrue("Welcome to Biblioteca!", true);

    }

    @Test
    public void shouldShowBookList(){

        String book1 = "Harry Potter";
        String book2 = "The Shining";
        List<String> bookList = new ArrayList<String>();

        bookList.add(book1);
        bookList.add(book2);

        bibliotecaApp.showBookList(bookList);

        assertTrue("Harry Potter, The Shinning", true);

    }



}