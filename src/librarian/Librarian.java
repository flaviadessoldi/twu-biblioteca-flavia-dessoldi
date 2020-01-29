package librarian;

import book.Book;
import book.BookList;

import java.util.Arrays;
import java.util.List;

public class Librarian {

    public static void welcomeMessage(String message) {

        System.out.println(message);
    }

    public static void showMenuOptions() {
        System.out.println("      Menu Options");
        System.out.println("=======================\n");
        System.out.println("1 - List books");
        System.out.println("0 - Quit");
    }

    public static void chooseOption(int option) {

        switch (option) {
            case 1:
                BookList bk = new BookList();
                bk.printBookList();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    public static void checkoutBook(){

    }





}

