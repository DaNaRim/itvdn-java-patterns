package L02_Builder.pizza;

import L02_Builder.pizza.builders.Director;
import L02_Builder.pizza.builders.PizzaBuilder;
import L02_Builder.pizza.builders.PizzaManualBuilder;
import L02_Builder.pizza.components.Cheese;
import L02_Builder.pizza.components.Meat;
import L02_Builder.pizza.components.Vegetables;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Patterns");

        PizzaBuilder builder = new PizzaBuilder();
        Director director = new Director();

        director.constructSeaPizza(builder);
        Pizza seaPizza = builder.getResult();
        System.out.println("Your order is sea pizza: " + seaPizza);

        director.constructMeatPizza(builder);
        Pizza meatPizza = builder.getResult();
        System.out.println("Your order is meat pizza: " + meatPizza);

        PizzaManualBuilder manualBuilder = new PizzaManualBuilder();

        director.constructMeatPizza(manualBuilder);
        manualBuilder.addCheese(Cheese.PARMESAN, Cheese.SMETANKOVIY);
        manualBuilder.addVegetables(Vegetables.CHILI_PEPPER, Vegetables.JALAPENO);
        manualBuilder.addMeat(Meat.PROSHUTTO);
        ManualPizza meatCheesyHotPizza = manualBuilder.getResult();

        System.out.println("Your order: " + meatCheesyHotPizza);
    }
}
