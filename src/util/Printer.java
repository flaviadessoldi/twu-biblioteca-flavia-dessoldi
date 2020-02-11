package util;

import model.Book;
import model.Customer;
import model.Movie;
import java.util.List;

public class Printer {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printOptions() {
        System.out.println("================================");
        System.out.println("           MENU OPTIONS");
        System.out.println("================================\n");
        System.out.println("1 - List Books");
        System.out.println("2 - List Movies");
        System.out.println("3 - Checkout item");
        System.out.println("4 - Return item");
        System.out.println("5 - Login as Librarian");
        System.out.println("0 - Quit");
        System.out.println("================================\n");
    }


    public void printBooklist(List<Book> bookList) {

        System.out.println("===================================================");
        System.out.println("                       BOOK LIST");
        System.out.println("===================================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "ID", "BOOK", "AUTHOR", "YEAR");

        for (int index = 0; index < bookList.size(); index++) {

            if (bookList.get(index).getFlag() == true) {
                System.out.printf("%-20s %-20s %-20s\n", bookList.get(index).getId(), bookList.get(index).getTitle(),
                        bookList.get(index).getAuthor(), bookList.get(index).getYear());

            }
        }
    }

    public void printMovielist(List<Movie> movieList) {

        System.out.println("===============================================");
        System.out.println("                     MOVIE LIST");
        System.out.println("===============================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "ID", "TITLE", "YEAR", "DIRECTOR", "RATE");

        for (int index = 0; index < movieList.size(); index++) {

            if (movieList.get(index).getFlag() == true) {
                System.out.printf("%-20s %-20s %-20s\n", movieList.get(index).getId(), movieList.get(index).getTitle(),
                        movieList.get(index).getYear(), movieList.get(index).getDirector(), movieList.get(index).getRate());


            }
        }
    }

    public void printCostumer(Customer customer) {

        System.out.println("===================================================");
        System.out.println("                 CUSTOMER INFORMATION");
        System.out.println("===================================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "NAME", "EMAIL", "PHONE NUMBER");


        if (customer.getLogged() == true) {
            System.out.printf("%-20s %-20s %-20s\n", customer.getName(), customer.getEmail(),
                    customer.getPhoneNumber());

        }
    }
}


