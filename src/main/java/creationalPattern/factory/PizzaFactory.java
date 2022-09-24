package creationalPattern.factory;

public class PizzaFactory {
    public static Pizza get(final String country){
//        switch (country){
//            case "RO":
//                return new PizzaDiavola();
//            case "US":
//                return new PizzaQuatroFormagi();
//            default:
//                return new PizzaMargherita();
//        }

        /////////////// VARIANTA PENTRU JAVA 17 ////////////////
         return switch (country){
            case "RO" -> new PizzaDiavola();
            case "US" -> new PizzaQuatroFormagi();
            default -> new PizzaMargherita();
        };
    }
}
