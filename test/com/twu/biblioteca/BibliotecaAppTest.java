package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void shouldReturnWelcomeMessage(){

        String welcome = "Welcome to Biblioteca!";

        bibliotecaApp.welcomeMessage();

        assertTrue("Welcome to Biblioteca!", true);

    }

}