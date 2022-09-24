package creationalPattern.solid.demendencyInversion.wrong;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("miau miau");
    }
}
