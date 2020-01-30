package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        Book book1 = new Book(true, "Harry Potter", "JK Rowling", "1998");
        Book book2 = new Book(true, "A hora da estrela", "Clarice Lispector", "1950");
        Book book3 = new Book(true, "Franny e Zoey", "J.D. Salinger", "1940");

        this.bookList = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
    }


    public List<Book> getBookList() {

        return this.bookList;
    }


    public void printBookList() {
        System.out.println("===============================================");
        System.out.println("                     BOOK LIST");
        System.out.println("===============================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "BOOK", "AUTHOR", "YEAR");

        for (int index = 0; index < bookList.size(); index++) {

            if (bookList.get(index).getFlag() == true) {
                System.out.printf("%-20s %-20s %-20s\n", bookList.get(index).getTitle(), bookList.get(index).getAuthor(), bookList.get(index).getYear());

            }
        }
    }
}
