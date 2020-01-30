package book;

public class Book {

    private boolean flag;
    private String title;
    private String author;
    private String year;

    public Book(boolean flag, String title, String author, String year) {
        this.flag = flag;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(){

    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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

                "Title: " + title + " | " +
                "Author: " + author + " | " +
                "Year: " + year + "\n";
    }



}
