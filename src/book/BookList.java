package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    private List<Book> bookList;

    public BookList() {
        Book book1 = new Book(1, "Harry Potter", "JK Rowling", "1998");
        Book book2 = new Book(2, "A hora da estrela", "Clarice Lispector", "1950");

        this.bookList = new ArrayList<Book>(Arrays.asList(book1, book2));
    }



    public List<Book> getBookList() {
        return bookList;
    }

    public void printBookList() {

        System.out.println("                     Book List");
        System.out.println("===============================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "IdBook", "Book", "Author", "Year");

        for (int index = 0; index < bookList.size(); index++) {

            System.out.printf("%-20s %-20s %-20s\n", bookList.get(index).getIdBook(), bookList.get(index).getTitle(), bookList.get(index).getAuthor(), bookList.get(index).getYear());

        }
    }
}
