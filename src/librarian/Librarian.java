package librarian;

import book.Book;
import book.BookList;

import java.util.Arrays;
import java.util.List;

public class Librarian {

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

                Book book1 = new Book (1, "Harry Potter", "JK Rowling", "1998");
                Book book2 = new Book (2, "A hora da estrela", "Clarice Lispector", "1950");

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
