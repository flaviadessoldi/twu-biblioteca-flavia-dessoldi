package librarian;

import book.Book;
import book.BookList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Librarian {

    public static void welcomeMessage(String message) {

        System.out.println(message);
    }

    public static void showMenuOptions() {
        System.out.println("================================");
        System.out.println("           MENU OPTIONS");
        System.out.println("================================\n");
        System.out.println("1 - List books");
        System.out.println("2 - Checkout a book");
        System.out.println("3 - Return a book");
        System.out.println("0 - Quit");
        System.out.println("================================\n");
    }

    public static void chooseOption(int option) throws IOException {

        switch (option) {
            case 1:
                BookList bk = new BookList();
                bk.printBookList();
                break;
            case 2:
                    checkoutBook();
                    break;
            case 3:
                returnBook();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    public static void checkoutBook() throws IOException {

        BookList bookList = new BookList();

        System.out.println("\nEnter the title of the book you want to check out:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookCheckOut = reader.readLine();

            Book b = bookList.getBookList().stream().filter(book -> bookCheckOut.equals(book.getTitle())).findFirst().orElse(null);
            if (b != null) {
                b.setFlag(false);
                System.out.println("The book " + bookCheckOut + " has been checked out!\n");
                bookList.printBookList();
            } else {
                System.out.println("Sorry, couldn't find that book. Try again!");
            }

        }


        public static void returnBook () throws IOException {
            BookList bookList = new BookList();

            System.out.println("\nEnter the title of the book you want to return: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String bookReturn = reader.readLine();

            Book b = bookList.getBookList().stream().filter(book -> bookReturn.equals(book.getTitle())).findFirst().orElse(null);
            if (b != null) {
                b.setFlag(true);
                System.out.println("The book " + bookReturn + " has been returned to Biblioteca!\n");
                bookList.printBookList();
            } else {
                System.out.println("Sorry, this book can't be returned. Try again!");
            }

        }
    }







