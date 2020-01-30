package librarian;

import book.Book;
import book.BookList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

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

    public static void chooseOption(int option) throws IOException {

        switch (option) {
            case 1:
                BookList bk = new BookList();
                bk.printBookList();
                break;
            case 2:
                    checkoutBook();

            case 3:
                returnBook();
            case 0:
                System.exit(0);
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    public static void checkoutBook() throws IOException {

        BookList bk = new BookList();

        System.out.println("Enter the book");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookCheck = reader.readLine();

        Book b = bk.getBookList().stream().filter(book -> bookCheck.toString().equals(book.getTitle().toString())).findFirst().orElse(null);

        b.setFlag(false);

        System.out.println("The book " + bookCheck + " has been checked out!");
        bk.printBookList();

    }



        public static void returnBook () {
//        BookList bk = new BookList();
//
//        System.out.println("Enter book title to be returned: ");
//        Scanner scanner = new Scanner(System.in);
//        String bookCheckIn = scanner.next();
//
//        if(bk.getBookList().contains(bookCheckIn))
//        {
//            bk.getBookList().add(bookCheckIn);
//            System.out.println("-----" + bookCheckIn + " has been returned!-----");
//
//        }
//        else
//            System.out.println(bookCheckIn + " is not in the library. Please enter "
//                    + "a different book to be checked out");
        }
    }







