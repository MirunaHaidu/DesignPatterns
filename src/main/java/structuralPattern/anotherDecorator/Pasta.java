package structuralPattern.anotherDecorator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Data
@SuperBuilder
@NoArgsConstructor
public class Pasta {
    private List<String> ingredients;

    public void displayIngredients(){
//        ingredients.forEach(System.out::println);
        System.out.println(ingredients);
    }

}
