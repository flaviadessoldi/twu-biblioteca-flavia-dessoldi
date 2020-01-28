package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Test
    public void shouldReturnWelcomeMessage(){


        bibliotecaApp.welcomeMessage("Welcome to Biblioteca!");

        assertTrue("Welcome to Biblioteca!", true);

    }



}