package L03_Factory.drinksEx.DrinkCreators;

import L03_Factory.drinksEx.DrinkCreators.Abstractions.DrinkCreator;
import L03_Factory.drinksEx.Drinks.Coffee.*;
import L03_Factory.drinksEx.Drinks.Enums.CoffeeTypes;
import L03_Factory.drinksEx.Drinks.Enums.DrinkTypes;
import L03_Factory.drinksEx.Drinks.Interfaces.Drink;

public class CoffeeCreator extends DrinkCreator {

    @Override
    public Drink pourDrink() {
        return new Coffee();
    }

    @Override
    public Drink pourDrink(DrinkTypes type) {
        return switch ((CoffeeTypes) type) {
            case ESPRESSO -> new Espresso();
            case LATE -> new Late();
            case CAPPUCCINO -> new Cappuccino();
            case AMERICANO -> new Americano();
        };
    }
}
