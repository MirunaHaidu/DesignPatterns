package creationalPattern.solid.demendencyInversion.correct;


public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("miau miau");
    }
}
