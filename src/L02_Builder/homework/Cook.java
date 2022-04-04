package L02_Builder.homework;

import L02_Builder.homework.ingredients.*;

public class Cook {

    private static final double SPECIALTY_BRAVO_PIZZA_SOLO_PRICE = 100.00;
    private static final double SPECIALTY_BRAVO_PIZZA_CLASSIC_PRICE = 165.00;
    private static final double SPECIALTY_BRAVO_PIZZA_MAXI_PRICE = 210.00;

    private static final double SPECIALTY_MEAT_PIZZA_SOLO_PRICE = 100.00;
    private static final double SPECIALTY_MEAT_PIZZA_CLASSIC_PRICE = 165.00;
    private static final double SPECIALTY_MEAT_PIZZA_MAXI_PRICE = 210.00;

    private static final double WHITE_PIZZA_SOLO_PRICE = 100.00;
    private static final double WHITE_PIZZA_CLASSIC_PRICE = 165.00;
    private static final double WHITE_PIZZA_MAXI_PRICE = 210.00;

    public Pizza cookSpecialtyBravoPizza(PizzaSize size) throws Exception {
        final double price = switch (size) {
            case SOLO -> SPECIALTY_BRAVO_PIZZA_SOLO_PRICE;
            case CLASSIC -> SPECIALTY_BRAVO_PIZZA_CLASSIC_PRICE;
            case MAXI -> SPECIALTY_BRAVO_PIZZA_MAXI_PRICE;
            default -> throw new Exception("Unsupported pizza size");
        };
        return Pizza.Builder.aPizza()
                .withName("Specialty bravo-pizza")
                .withSize(size)
                .withPrice(price)
                .withMeat(Meat.SMOKED_CHICKEN, Meat.SAUSAGE)
                .withMushrooms(Mushrooms.CHAMPIGNONS)
                .withVegetables(Vegetables.PICKLES, Vegetables.CORN, Vegetables.PICKLES)
                .build();
    }

    public Pizza cookSpecialtyMeatPizza(PizzaSize size) throws Exception {
        final double price = switch (size) {
            case SOLO -> SPECIALTY_MEAT_PIZZA_SOLO_PRICE;
            case CLASSIC -> SPECIALTY_MEAT_PIZZA_CLASSIC_PRICE;
            case MAXI -> SPECIALTY_MEAT_PIZZA_MAXI_PRICE;
            default -> throw new Exception("Unsupported pizza size");
        };
        return Pizza.Builder.aPizza()
                .withName("Specialty meat")
                .withSize(size)
                .withPrice(price)
                .withMeat(Meat.BRISKET, Meat.SAUSAGE, Meat.SMOKED_CHICKEN, Meat.SALAMI)
                .withVegetables(Vegetables.TOMATOES, Vegetables.CORN)
                .withCheeses(Cheeses.CHEESE)
                .withSauces(Sauces.SAUCE, Sauces.MUSTARD)
                .build();
    }

    public Pizza cookWhitePizza(PizzaSize size) throws Exception {
        final double price = switch (size) {
            case SOLO -> WHITE_PIZZA_SOLO_PRICE;
            case CLASSIC -> WHITE_PIZZA_CLASSIC_PRICE;
            case MAXI -> WHITE_PIZZA_MAXI_PRICE;
            default -> throw new Exception("Unsupported pizza size");
        };
        return Pizza.Builder.aPizza()
                .withName("White pizza")
                .withSize(size)
                .withPrice(price)
                .withMeat(Meat.SMOKED_CHICKEN)
                .withMushrooms(Mushrooms.CHAMPIGNONS)
                .withCheeses(Cheeses.CHEESE)
                .withSauces(Sauces.CREAMER)
                .build();
    }
}
