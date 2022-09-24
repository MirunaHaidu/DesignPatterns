package creationalPattern.solid.openClosed.correct;

public class HorrorMovie implements Movie{

    @Override
    public void makeSound() {
        System.out.println("bohohoho");
    }
}
