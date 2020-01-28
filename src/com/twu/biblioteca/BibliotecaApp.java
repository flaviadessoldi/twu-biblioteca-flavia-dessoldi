package com.twu.biblioteca;

import book.Book;
import book.BookList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        welcomeMessage("Welcome to Biblioteca!");

        BookList bk = new BookList();

        Book book1 = new Book ("Harry Potter", "JK Rowling", "1998");
        Book book2 = new Book ("A hora da estrela", "Clarice Lispector", "1950");

        List<Book> listBook = Arrays.asList(book1, book2);

        bk.printBookList(listBook);

    }

    public static void welcomeMessage(String message){

        System.out.println(message);
    }


    }











