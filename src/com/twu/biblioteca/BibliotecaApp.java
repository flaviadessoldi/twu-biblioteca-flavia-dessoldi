package com.twu.biblioteca;

import librarian.Librarian;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Librarian lb = new Librarian();

        lb.welcomeMessage("Welcome to Biblioteca!");

        int option = 1;
        while(option != 0){
            lb.showMenuOptions();
            System.out.println("Please, choose your option. ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            lb.chooseOption(option);
        }



    }






    }














