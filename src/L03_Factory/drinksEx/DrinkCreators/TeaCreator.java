package L03_Factory.drinksEx.DrinkCreators;

import L03_Factory.drinksEx.DrinkCreators.Abstractions.DrinkCreator;
import L03_Factory.drinksEx.Drinks.Enums.DrinkTypes;
import L03_Factory.drinksEx.Drinks.Enums.TeaTypes;
import L03_Factory.drinksEx.Drinks.Interfaces.Drink;
import L03_Factory.drinksEx.Drinks.Tea.*;

public class TeaCreator extends DrinkCreator {

    @Override
    public Drink pourDrink() {
        return new Tea();
    }

    @Override
    public Drink pourDrink(DrinkTypes type) {
        return switch ((TeaTypes) type) {
            case BLACK -> new BlackTea();
            case GREEN -> new GreenTea();
            case WHITE -> new WhiteTea();
            case MILK_OOLONG -> new MilkOolongTea();
        };
    }
}
