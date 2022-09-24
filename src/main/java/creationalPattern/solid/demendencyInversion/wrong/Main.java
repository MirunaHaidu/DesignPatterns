package creationalPattern.solid.demendencyInversion.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(new Cat(),
                                new Cat());
        Household household = new Household();
        household.setCats(cats);
        household.getCats().forEach(Cat::makeSound);
        //daca vreau si caini trebuie sa fac o lista separata etc.
    }
}
