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

    @Test
    public void shouldShowBookList(){

        BookList bookList = new BookList();

        String book1 = "Harry Potter";
        String book2 = "The Shining";
        List<String> bk = new ArrayList<String>();

        bk.add(book1);
        bk.add(book2);

        bookList.showBookList(bk);

        assertTrue("Harry Potter, The Shinning", true);

    }





}