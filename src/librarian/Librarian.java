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

        BookList bk = new BookList();

        System.out.println("\nEnter the title of the book you want to check out:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookCheck = reader.readLine();

            Book b = bk.getBookList().stream().filter(book -> bookCheck.toString().equals(book.getTitle().toString())).findFirst().orElse(null);
            b.setFlag(false);
            System.out.println("The book " + bookCheck + " has been checked out!\n");
            bk.printBookList();


        }





        public static void returnBook () throws IOException {
            BookList bk = new BookList();

            System.out.println("\nEnter the title of the book you want to return: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String bookCheck = reader.readLine();

            Book b = bk.getBookList().stream().filter(book -> bookCheck.toString().equals(book.getTitle().toString())).findFirst().orElse(null);

            b.setFlag(true);

            System.out.println("The book " + bookCheck + " has been returned to Biblioteca!\n");
            bk.printBookList();
        }
    }







