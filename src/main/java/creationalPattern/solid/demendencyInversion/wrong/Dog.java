package creationalPattern.solid.demendencyInversion.wrong;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
