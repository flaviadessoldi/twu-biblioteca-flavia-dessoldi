package model;

import repository.CostumerRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Costumer {

    private boolean logged;
    private String name;
    private String libraryNumber;
    private String password;
    private List<Book> costumerBooks;


    public Costumer(String name, String libraryNumber, String password) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.password = password;

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

    public List<Book> getCostumerBooks() {
        return costumerBooks;
    }

    public void setCostumerBooks(List<Book> costumerBooks) {
        this.costumerBooks = costumerBooks;
    }




    public boolean verifyLogin(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Costumer)) return false;
        Costumer costumer = (Costumer) o;
        return getLibraryNumber() == costumer.getLibraryNumber() &&
                Objects.equals(getName(), costumer.getName()) &&
                getPassword().equals(costumer.getPassword()) &&
                Objects.equals(getCostumerBooks(), costumer.getCostumerBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLibraryNumber(), getPassword(), getCostumerBooks());
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", libraryNumber=" + libraryNumber +
                ", password='" + password + '\'' +
                ", costumerBooks=" + costumerBooks +
                '}';
    }
}
