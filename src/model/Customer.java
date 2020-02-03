package model;

import java.util.List;
import java.util.Objects;

public class Customer {

    private boolean logged;
    private String name;
    private String libraryNumber;
    private String password;
    private String email;
    private String phoneNumber;
    private List<Book> customerBooks;


    public Customer(String name, String libraryNumber, String password, String email, String phoneNumber) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.password = password;

        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public boolean getLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getCustomerBooks() {
        return customerBooks;
    }

    public void setCustomerBooks(List<Book> custumerBooks) {
        this.customerBooks = custumerBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getLogged() == customer.getLogged() &&
                Objects.equals(getName(), customer.getName()) &&
                getLibraryNumber().equals(customer.getLibraryNumber()) &&
                Objects.equals(getPassword(), customer.getPassword()) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(getPhoneNumber(), customer.getPhoneNumber()) &&
                Objects.equals(getCustomerBooks(), customer.getCustomerBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogged(), getName(), getLibraryNumber(), getPassword(), email, getPhoneNumber(), getCustomerBooks());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "logged=" + logged +
                ", name='" + name + '\'' +
                ", libraryNumber='" + libraryNumber + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerBooks=" + customerBooks +
                '}';
    }
}
