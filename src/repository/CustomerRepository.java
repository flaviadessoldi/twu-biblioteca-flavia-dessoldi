package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerRepository {


    List<Customer> customerList;

    public CustomerRepository() {

        Customer customer1 = new Customer("Flavia", "123-1234", "banana", "flavia@email.com", "555-1234");
        Customer customer2 = new Customer("Daniela", "321-4321", "pera", "daniela@email.com", "555-4321");
        this.customerList = new ArrayList<>(Arrays.asList(customer1, customer2));
    }

    public List<Customer> getCustomerList() {
        return this.customerList;
    }

    public void printCostumer() {
        System.out.println("===================================================");
        System.out.println("                 CUSTOMER INFORMATION");
        System.out.println("===================================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "NAME", "EMAIL", "PHONE NUMBER");

        for (int index = 0; index < customerList.size(); index++) {

            if (customerList.get(index).getLogged() == true) {
                System.out.printf("%-20s %-20s %-20s\n", customerList.get(index).getName(), customerList.get(index).getEmail(),
                        customerList.get(index).getPhoneNumber());

            }
        }
    }



}
