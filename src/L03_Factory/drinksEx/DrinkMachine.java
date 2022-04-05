package L03_Factory.drinksEx;

import L03_Factory.drinksEx.DrinkCreators.Abstractions.DrinkCreator;
import L03_Factory.drinksEx.DrinkCreators.CoffeeCreator;
import L03_Factory.drinksEx.DrinkCreators.TeaCreator;
import L03_Factory.drinksEx.Drinks.Enums.CoffeeTypes;
import L03_Factory.drinksEx.Drinks.Enums.TeaTypes;

public class DrinkMachine {

    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        DrinkCreator teaCreator = new TeaCreator();
        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink();

        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink(TeaTypes.MILK_OOLONG);

        DrinkCreator coffeeCreator = new CoffeeCreator();
        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink();

        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink(CoffeeTypes.CAPPUCCINO);

    }
}
