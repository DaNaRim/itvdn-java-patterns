package L03_Factory.drinksEx.DrinkCreators.Abstractions;

import L03_Factory.drinksEx.Drinks.Enums.DrinkTypes;
import L03_Factory.drinksEx.Drinks.Interfaces.Drink;

public abstract class DrinkCreator {

    public abstract Drink pourDrink();

    public abstract Drink pourDrink(DrinkTypes types);

    public String displayMessage() {
        return "Take your ";
    }
}
