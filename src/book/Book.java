package book;

public class Book {

    private int idBook;
    private String title;
    private String author;
    private String year;

    public Book(int idBook, String title, String author, String year) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(){

    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "IdBook: " + idBook + " | " +
                "Title: " + title + " | " +
                "Author: " + author + " | " +
                "Year: " + year + "\n";
    }



}
