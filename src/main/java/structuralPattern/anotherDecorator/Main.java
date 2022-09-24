package structuralPattern.anotherDecorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pasta pasta = Pasta.builder()
                .ingredients(List.of("water", "salt", "oil"))
                .build();

        pasta.displayIngredients();

        Pasta carbonara = PastaDecorator.builder()
                .pasta(pasta)
                .ingredients(List.of("egg", "pancetta", "bacon", "parmigiano"))
                .build();
//        System.out.println(carbonara);
        carbonara.displayIngredients();

    }
}
