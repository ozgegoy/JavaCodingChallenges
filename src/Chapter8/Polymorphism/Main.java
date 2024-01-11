package Chapter8.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Movie("Star Wars");
//        movie.watchMovie();

//        Movie movie = new Adventure("Star Wars");
//        movie.watchMovie();

//        Movie movie = Movie.getMovie("Science", "Star Wars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
