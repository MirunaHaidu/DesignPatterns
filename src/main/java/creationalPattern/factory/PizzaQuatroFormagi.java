package creationalPattern.factory;

public class PizzaQuatroFormagi implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking quatro formagi. I love cheese!");
    }
}
