package repository;

import model.Customer;
import model.Librarian;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private List<Customer> customerList = new ArrayList<>();
    private List<Librarian> librarianList = new ArrayList<>();


    private Map<String,Customer> customerListMap = new HashMap<>();

    public Map<String,Customer> customerMap(){
        customerListMap.put("123-1234",
                new Customer(false,"Flavia",  "banana", "flavia@email.com", "555-1234" ));
        customerListMap.put("321-4321",
                new Customer(false, "Daniela", "pera", "daniela@email.com", "555-4321"));

        return  customerListMap;
    }



    private List<Librarian> populateLibrarianList() {
        librarianList.add(new Librarian("1234"));
        librarianList.add(new Librarian("4321"));

        return librarianList;
    }

    public UserRepository() {
        customerMap();
        populateLibrarianList();
    }

    public List<Customer> getCustomerList() {
        return this.customerList;
    }

    public List<Librarian> getLibrarianList() {
        return this.librarianList;
    }


}



