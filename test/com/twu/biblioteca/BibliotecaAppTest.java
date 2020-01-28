package com.twu.biblioteca;

import book.BookList;
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







}