package model;

import java.util.List;
import java.util.Objects;

public class Costumer {

    private boolean logged;
    private String name;
    private String libraryNumber;
    private String password;
    private String email;
    private String phoneNumber;
    private List<Book> costumerBooks;


    public Costumer(String name, String libraryNumber, String password, String email, String phoneNumber) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.password = password;

        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Costumer() {
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

    public List<Book> getCostumerBooks() {
        return costumerBooks;
    }

    public void setCostumerBooks(List<Book> costumerBooks) {
        this.costumerBooks = costumerBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Costumer)) return false;
        Costumer costumer = (Costumer) o;
        return getLogged() == costumer.getLogged() &&
                Objects.equals(getName(), costumer.getName()) &&
                getLibraryNumber().equals(costumer.getLibraryNumber()) &&
                Objects.equals(getPassword(), costumer.getPassword()) &&
                Objects.equals(email, costumer.email) &&
                Objects.equals(getPhoneNumber(), costumer.getPhoneNumber()) &&
                Objects.equals(getCostumerBooks(), costumer.getCostumerBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogged(), getName(), getLibraryNumber(), getPassword(), email, getPhoneNumber(), getCostumerBooks());
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "logged=" + logged +
                ", name='" + name + '\'' +
                ", libraryNumber='" + libraryNumber + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", costumerBooks=" + costumerBooks +
                '}';
    }
}
