package creationalPattern.solid.openClosed.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(new Movie("comedy"),
                new Movie("horror"),
                new Movie("action"));  // trebuie sa mergem la la clasa de movie si sa il adaugam

        movies.forEach(Movie::makeSound);
    }
}
