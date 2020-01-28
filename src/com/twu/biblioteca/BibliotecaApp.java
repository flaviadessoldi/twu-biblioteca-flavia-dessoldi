package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        welcomeMessage("Welcome to Biblioteca!");

        List<String> bookList = new ArrayList<String>();
        String book1 = "Harry Potter";
        String book2 = "The Shining";

        bookList.add(book1);
        bookList.add(book2);

        showBookList(bookList);

    }

    public static void welcomeMessage(String message){

        System.out.println(message);
    }

    public static void showBookList(List<String> bookList){

        System.out.println(bookList);
    }







}

