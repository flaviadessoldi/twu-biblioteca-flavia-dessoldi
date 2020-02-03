package com.twu.biblioteca;

import menu.Menu;
import model.Librarian;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {


        Menu menu = new Menu();

        menu.welcomeMessage("=ˆ.ˆ= Welcome to Biblioteca! =ˆ.ˆ=\n");

//        lb.login();

        int option = 1;
        while(option != 0){
            menu.showMenuOptions();
            System.out.println("Please, choose your option. ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            menu.chooseOption(option);
        }



    }






    }














