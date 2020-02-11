package util;

import model.*;
import repository.UserRepository;
import repository.ItemRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputs {

    Printer printer = new Printer();
    ItemRepository itemRepository = new ItemRepository();
    UserRepository userRepository = new UserRepository();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void chooseOption(int option) throws IOException {

        switch (option) {
            case 1:
                printer.printBooklist(itemRepository.getBookList());
                break;
            case 2:
                printer.printMovielist(itemRepository.getMovieList());
                break;
            case 3:
                login();
                itemRepository.checkOutItem();
                break;
            case 4:
                login();
                itemRepository.returnItem();
                break;
            case 5:
                loginLibrarian();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                printer.printMessage("Select a valid option!");
                break;
        }
    }


    public void login() throws IOException {

        printer.printMessage("\nEnter your Library Register: ");
        String register = reader.readLine();

        printer.printMessage("\nEnter your PassWord: ");
        String password = reader.readLine();

        Customer costumer = userRepository.customerMap().get(register);

        if (costumer.getPassword().equals(password)) {
            costumer.setLogged(true);
            printer.printMessage("\nHello, you are logged in!\n");
            printer.printCostumer(costumer);
        } else {
            printer.printMessage("Sorry, impossible to login! Try again!");
        }
    }


    public void loginLibrarian() throws IOException {

        printer.printMessage("\nEnter your password: ");

        String pass = reader.readLine();

        Librarian l = userRepository.getLibrarianList().stream().filter(librarian -> pass.equals(librarian.getPassword())).findFirst().orElse(null);

        if (l != null) {
            l.isLogged();
            printer.printMessage(userRepository.getCustomerList().toString());
            printer.printMessage("\nHello, you are logged in!\n");

        } else {
            printer.printMessage("Sorry, impossible to login! Try again!");
        }

    }
}
