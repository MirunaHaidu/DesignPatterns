package creationalPattern.solid.liskov;

public class Main {
    public static void main(String[] args) {
        Movie movie = new ComedyMovie(); // putem atribui orice subclasa
        movie = new HorrorMovie(); // il putem si modifica
    }
}
