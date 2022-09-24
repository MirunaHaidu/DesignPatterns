package creationalPattern.solid.demendencyInversion.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = List.of(new Cat(),
                new Dog());

        Household household = new Household();
        household.setAnimals(animals);
        household.getAnimals().forEach(Animal::makeSound);


    }
}
