package L02_Builder.pizza.builders;

import L02_Builder.pizza.ManualPizza;
import L02_Builder.pizza.components.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaManualBuilder implements Builder {

    private Dough dough;
    private Sauce sauce;
    private List<Cheese> cheese;
    private List<Meat> meat;
    private List<Vegetables> vegetables;

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setCheese(Cheese... cheese) {
        this.cheese = Arrays.asList(cheese);
    }

    @Override
    public void setMeet(Meat... meat) {
        this.meat = Arrays.asList(meat);
    }

    @Override
    public void setVegetables(Vegetables... vegetables) {
        this.vegetables = Arrays.asList(vegetables);
    }

    public void addCheese(Cheese... cheeses) {
        List<Cheese> newCheeseList = new ArrayList<>();
        newCheeseList.addAll(this.cheese);
        newCheeseList.addAll(Arrays.asList(cheeses));
        this.cheese = newCheeseList;
    }

    public void addMeat(Meat... meats) {
        List<Meat> newMeatList = new ArrayList<>();
        newMeatList.addAll(this.meat);
        newMeatList.addAll(Arrays.asList(meats));
        this.meat = newMeatList;
    }

    public void addVegetables(Vegetables... vegetables) {
        List<Vegetables> newVegetablesList = new ArrayList<>();
        newVegetablesList.addAll(this.vegetables);
        newVegetablesList.addAll(Arrays.asList(vegetables));
        this.vegetables = newVegetablesList;
    }

    public ManualPizza getResult() {
        return new ManualPizza(this.dough, this.sauce, this.cheese, this.meat, this.vegetables);
    }
}
