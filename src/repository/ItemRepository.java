package repository;

import model.Customer;
import util.Printer;
import model.Book;
import model.Movie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemRepository {

    private List<Book> bookList = new ArrayList<>();
    private List<Movie> movieList = new ArrayList<>();

    private List<Book> populateBookList() {
        bookList.add(new Book(true, "1", "Harry Potter", "JK Rowling", "1998"));
        bookList.add(new Book(true, "2", "A hora da estrela", "Clarice Lispector", "1950"));
        bookList.add(new Book(true, "3", "Franny e Zoey", "J.D. Salinger", "1940"));

        return this.bookList;
    }


    private List<Movie> populateMovieList() {
        movieList.add(new Movie(true, "4", "Moulin Rouge", 1998, "Baz Luhrman", 8));
        movieList.add(new Movie(true, "5", "Star Wars", 1970, "George Luccas", 8));
        movieList.add(new Movie(true, "6", "O Iluminado", 1965, "Kubrick", 10));
        return this.movieList;
    }

    public ItemRepository() {
        populateBookList();
        populateMovieList();
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public List<Movie> getMovieList() {
        return this.movieList;
    }


    public void checkOutItem() throws IOException {

        Customer customer = new Customer();
        Printer p = new Printer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        p.printMessage("\nEnter the id of the item you want to check out:");

        String itemCheckOut = reader.readLine();

        Book b = this.getBookList().stream().filter(item -> itemCheckOut.equals(item.getId())).findFirst().orElse(null);

        Movie m = this.getMovieList().stream().filter(item -> itemCheckOut.equals(item.getId())).findFirst().orElse(null);

        if (b != null) {
            b.setFlag(false);
            p.printMessage("\nThe book " + itemCheckOut + " has been checked out!\n");
            p.printBooklist(this.getBookList());
            customer.setCustomerBooks(new ArrayList<>(Arrays.asList(b)));

        } else if (m != null) {
            m.setFlag(false);
            p.printMessage("\nThe movie " + itemCheckOut + " has been checked out!\n");
            p.printMovielist(this.getMovieList());
        } else {
            p.printMessage("\nSorry, couldn't find that item. Try again!");
        }
    }


    public void returnItem() throws IOException {
        Printer p = new Printer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        p.printMessage("\nEnter the title of the book you want to return: ");

        String itemReturn = reader.readLine();

        Book b = this.getBookList().stream().filter(item -> itemReturn.equals(item.getId())).findFirst().orElse(null);
        Movie m = this.getMovieList().stream().filter(item -> itemReturn.equals(item.getId())).findFirst().orElse(null);

        if (b != null) {
            b.setFlag(true);
            p.printMessage("\nThe book " + itemReturn + " has been returned!\n");
            p.printBooklist(this.getBookList());


        } else if (m != null) {
            m.setFlag(true);
            p.printMessage("\nThe movie " + itemReturn + " has been returned!\n");
            p.printMovielist(this.getMovieList());
        } else {
            p.printMessage("\nSorry, couldn't find that item. Try again!");
        }


    }

}

