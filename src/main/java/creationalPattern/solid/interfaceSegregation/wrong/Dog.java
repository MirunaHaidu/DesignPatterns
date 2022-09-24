package creationalPattern.solid.interfaceSegregation.wrong;

public class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("woof");
    }

    //celelalte sunt inutile, cainele nu are nevoie sa le faca pe celelalte

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void crawl() {

    }

    @Override
    public void eat() {
        System.out.println("nomnomnom");
    }
}
