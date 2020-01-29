package com.twu.biblioteca;

import book.Book;
import book.BookList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        welcomeMessage("Welcome to Biblioteca!");


        int option = 1;
        while(option != 0){
            showMenuOptions();
            System.out.println("Please, choose one option");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            chooseOption(option);
        }



    }

    public static void welcomeMessage(String message){

        System.out.println(message);
    }

    public static void showMenuOptions() {
        System.out.println("      Menu Options");
        System.out.println("=======================\n");
        System.out.println("1 - List books");
        System.out.println("0 - Quit");
    }

    public static void chooseOption(int option){

        switch (option){
            case 1:
                BookList bk = new BookList();

                Book book1 = new Book ("Harry Potter", "JK Rowling", "1998");
                Book book2 = new Book ("A hora da estrela", "Clarice Lispector", "1950");

                List<Book> listBook = Arrays.asList(book1, book2);

                bk.printBookList(listBook);
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }




    }














