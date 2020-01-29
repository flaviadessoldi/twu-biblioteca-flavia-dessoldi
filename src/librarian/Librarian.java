package librarian;

import book.Book;
import book.BookList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Librarian {

    public static void welcomeMessage(String message) {

        System.out.println(message);
    }

    public static void showMenuOptions() {
        System.out.println("      Menu Options");
        System.out.println("=======================\n");
        System.out.println("1 - List books");
        System.out.println("2 - Checkout a book");
        System.out.println("3 - Return a book");
        System.out.println("0 - Quit");
    }

    public static void chooseOption(int option) {

        int idBook = 1;

        switch (option) {
            case 1:
                BookList bk = new BookList();
                bk.printBookList();
                break;
            case 2:
                    checkoutBook(idBook);

            case 3:
                returnBook();
            case 0:
                System.exit(0);
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    public static void checkoutBook(int idBook){

        BookList bk = new BookList();

        System.out.println("Enter the IdBook");
        Scanner scanner = new Scanner(System.in);
        idBook = scanner.nextInt();

        for (int i=0; i< bk.getBookList().size(); i++) {

            if (idBook == bk.getBookList().indexOf(i)) {
                System.out.println("Success!");
            } else {
                System.out.println("Sorry! Book unavailable!");
            }
        }


    }

    public static void returnBook(){

    }





}

