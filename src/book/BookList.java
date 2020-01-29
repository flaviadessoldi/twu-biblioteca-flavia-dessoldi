package book;

import java.util.List;

public class BookList {

    List<Book> bookList;

    public void printBookList(List<Book> bookList) {

        System.out.println("                     Book List");
        System.out.println("===============================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "IdBook", "Book", "Author", "Year");

        for (int index = 0; index < bookList.size(); index++) {

            System.out.printf("%-20s %-20s %-20s\n", bookList.get(index).getIdBook(), bookList.get(index).getTitle(), bookList.get(index).getAuthor(), bookList.get(index).getYear());

        }
    }
}
