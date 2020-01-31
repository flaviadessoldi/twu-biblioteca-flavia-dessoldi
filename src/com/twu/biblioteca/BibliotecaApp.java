package com.twu.biblioteca;

import librarian.Librarian;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {


        Librarian lb = new Librarian();

        lb.welcomeMessage("=ˆ.ˆ= Welcome to Biblioteca! =ˆ.ˆ=\n");

//        lb.login();

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














