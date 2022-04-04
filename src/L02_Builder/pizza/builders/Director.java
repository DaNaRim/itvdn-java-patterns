package L02_Builder.pizza.builders;

import L02_Builder.pizza.components.*;

public class Director {

    public void constructSeaPizza(Builder builder) {
        builder.setDough(Dough.THIN);
        builder.setSauce(Sauce.WHITE);
        builder.setCheese(Cheese.MOZZARELLA);
        builder.setMeet(Meat.SALMON, Meat.SRIMPS);
        builder.setVegetables(Vegetables.BELL_PEPPER, Vegetables.OLIVES);
    }

    public void constructMeatPizza(Builder builder) {
        builder.setDough(Dough.THICK);
        builder.setSauce(Sauce.RED);
        builder.setCheese(Cheese.CHEDDER, Cheese.MOZZARELLA);
        builder.setMeet(Meat.BAKED_BEEF, Meat.SAUSAGES, Meat.SMOKED_MEAT);
        builder.setVegetables(Vegetables.BELL_PEPPER, Vegetables.OLIVES, Vegetables.PICKELS);
    }
}
