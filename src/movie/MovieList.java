package movie;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {

    private List<Movie> movieList;

    public MovieList() {
        Movie movie1 = new Movie(true, "Moulin Rouge", 1998, "Baz Luhrman", 8);
        Movie movie2 = new Movie(true, "Star Wars", 1970, "George Luccas", 8);
        Movie movie3 = new Movie(true, "O Iluminado", 1965, "Kubrick", 10);

        this.movieList = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
    }


    public List<Movie> getMovieList() {

        return this.movieList;
    }


    public void printMovieList() {
        System.out.println("========================================================");
        System.out.println("                        MOVIE LIST");
        System.out.println("========================================================\n");

        System.out.printf("%-20s %-20s %-20s\n", "TITLE", "YEAR", "DIRECTOR", "RATE");

        for (int index = 0; index < movieList.size(); index++) {

            if (movieList.get(index).getFlag() == true) {
                System.out.printf("%-20s %-20s %-20s\n", movieList.get(index).getTitle(),
                        movieList.get(index).getYear(), movieList.get(index).getDirector(), movieList.get(index).getRate());

            }
        }
    }
}
