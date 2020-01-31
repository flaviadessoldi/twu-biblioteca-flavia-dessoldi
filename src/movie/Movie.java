package movie;

import java.util.Objects;

public class Movie {

    private boolean flag;
    private String title;
    private int year;
    private String director;
    private int rate;

    public Movie(boolean flag, String title, int year, String director, int rate) {
        this.flag = flag;
        this.title = title;
        this.year = year;
        this.director = director;
        this.rate = rate;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getYear() == movie.getYear() &&
                getRate() == movie.getRate() &&
                getTitle().equals(movie.getTitle()) &&
                Objects.equals(getDirector(), movie.getDirector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYear(), getDirector(), getRate());
    }

    @Override
    public String toString() {
        return
                "Title='" + title + " | " +
                "Year=" + year +  " | " +
                "Director='" + director + " | " +
                "Rate=" + rate;
    }


}
