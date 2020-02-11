package com.twu.biblioteca;

import util.Printer;
import util.UserInputs;
import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {

        UserInputs userInputs = new UserInputs();
        Printer printer = new Printer();

        printer.printMessage("=ˆ.ˆ= Welcome to Biblioteca! =ˆ.ˆ=\n");

        int option = 1;
        while (option != 0) {
            printer.printOptions();
            printer.printMessage("Please, choose your option. ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            userInputs.chooseOption(option);
        }


    }


}














