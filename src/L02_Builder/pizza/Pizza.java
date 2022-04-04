package L02_Builder.pizza;

import L02_Builder.pizza.components.*;

import java.util.List;

public class Pizza {

    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Vegetables> vegetables;

    public Pizza(Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Vegetables> vegetables) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Cheese> getCheese() {
        return cheese;
    }

    public List<Meat> getMeet() {
        return meat;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meet=" + meat +
                ", vegetables=" + vegetables +
                '}';
    }
}
