package menu;

import model.Book;
import model.Customer;
import model.Librarian;
import model.Movie;
import repository.BookRepository;
import repository.CustomerRepository;
import repository.MovieRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    public static void welcomeMessage(String message) {

        System.out.println(message);
    }

    public static void showMenuOptions() {
        System.out.println("================================");
        System.out.println("           MENU OPTIONS");
        System.out.println("================================\n");
        System.out.println("1 - List Books");
        System.out.println("2 - Checkout a book");
        System.out.println("3 - Return a book");
        System.out.println("4 - List Movies");
        System.out.println("5 - Checkout a movie");
        System.out.println("6 - Return a movie");
        System.out.println("7 - Login as Librarian");
        System.out.println("0 - Quit");
        System.out.println("================================\n");
    }

    public static void chooseOption(int option) throws IOException {

        switch (option) {
            case 1:
                BookRepository bk = new BookRepository();
                bk.printBookList();
                break;
            case 2:
                checkoutBook();

                break;
            case 3:
                login();
                returnBook();
                break;
            case 4:
                MovieRepository ml = new MovieRepository();
                ml.printMovieList();
                break;
            case 5:
                login();
                checkoutMovie();
                break;
            case 6:
                login();
                returnMovie();
                break;
            case 7:
                loginLibrarian();
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

        BookRepository bookRepository = new BookRepository();
        Customer customer = new Customer();

        System.out.println("\nEnter the title of the book you want to check out:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookCheckOut = reader.readLine();

        Book b = bookRepository.getBookList().stream().filter(book -> bookCheckOut.equals(book.getTitle())).findFirst().orElse(null);
        if (b != null) {
            login();
            b.setFlag(false);
            System.out.println("\nThe book " + bookCheckOut + " has been checked out!\n");
            bookRepository.printBookList();
            customer.setCustomerBooks(new ArrayList<>(Arrays.asList(b)));

            System.out.println("\nYour current checked out books are: " + customer.getCustomerBooks().toString());
        } else {
            System.out.println("\nSorry, couldn't find that book. Try again!");
        }

    }

    public static void checkoutMovie() throws IOException {

        MovieRepository movieRepository = new MovieRepository();

        System.out.println("\nEnter the title of the movie you want to check out:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String movieCheckOut = reader.readLine();

        Movie m = movieRepository.getMovieList().stream().filter(movie -> movieCheckOut.equals(movie.getTitle())).findFirst().orElse(null);
        if (m != null) {
            m.setFlag(false);
            System.out.println("The movie " + movieCheckOut + " has been checked out!\n");
            movieRepository.printMovieList();
        } else {
            System.out.println("Sorry, couldn't find that movie. Try again!");
        }

    }


    public static void returnBook () throws IOException {
        BookRepository bookRepository = new BookRepository();

        System.out.println("\nEnter the title of the book you want to return: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bookReturn = reader.readLine();

        Book b = bookRepository.getBookList().stream().filter(book -> bookReturn.equals(book.getTitle())).findFirst().orElse(null);
        if (b != null) {
            b.setFlag(true);
            System.out.println("The book " + bookReturn + " has been returned to Biblioteca!\n");
            bookRepository.printBookList();
        } else {
            System.out.println("Sorry, this book can't be returned. Try again!");
        }

    }

    public static void returnMovie () throws IOException {
        MovieRepository movieRepository = new MovieRepository();

        System.out.println("\nEnter the title of the movie you want to return: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String movieReturn = reader.readLine();

        Movie m = movieRepository.getMovieList().stream().filter(movie -> movieReturn.equals(movie.getTitle())).findFirst().orElse(null);
        if (m != null) {
            m.setFlag(true);
            System.out.println("The movie " + movieReturn + " has been returned to Biblioteca!\n");
            movieRepository.printMovieList();
        } else {
            System.out.println("Sorry, this movie can't be returned. Try again!");
        }

    }

    public static void login() throws IOException {

        CustomerRepository cr = new CustomerRepository();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter your Library Register: ");

        String register = reader.readLine();

        Customer r = cr.getCustomerList().stream().filter(customer -> register.equals(customer.getLibraryNumber())).findFirst().orElse(null);

        System.out.println("\nEnter your PassWord: ");

        String pass = reader.readLine();

        Customer p = cr.getCustomerList().stream().filter(customer -> pass.equals(customer.getPassword())).findFirst().orElse(null);

        if ( r!= null && p !=null) {
            p.setLogged(true);
            System.out.println("\nHello, you are logged in!\n");
            cr.printCostumer();
        } else{
            System.out.println("Sorry, impossible to login! Try again!");
        }

    }

    public static void loginLibrarian() throws IOException {


        Librarian lr = new Librarian("123");

        CustomerRepository cr = new CustomerRepository();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter your password: ");

        String password = reader.readLine();

        if ( password!= null && password.equals(lr.getPassword())) {
            lr.isLogged();
            System.out.println(cr.getCustomerList().toString());
            System.out.println("\nHello, you are logged in!\n");
            ;
        } else{
            System.out.println("Sorry, impossible to login! Try again!");
        }

    }
}
