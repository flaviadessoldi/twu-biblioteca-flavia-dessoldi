package com.twu.biblioteca;

import book.BookList;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        BookList bookList = new BookList();

        System.out.println("Hello, world!");

        welcomeMessage("Welcome to Biblioteca!");

        List<String> bk = new ArrayList<String>();
        String book1 = "Harry Potter";
        String book2 = "The Shining";

        bk.add(book1);
        bk.add(book2);

        bookList.showBookList(bk);



    }

    public static void welcomeMessage(String message){

        System.out.println(message);
    }









}

