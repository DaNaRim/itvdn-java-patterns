package L02_Builder.homework;

import L02_Builder.homework.ingredients.*;

import java.util.List;

public class Pizza {

    private String name;
    private double price;
    private PizzaSize size;

    private List<Meat> meat;
    private List<Mushrooms> mushrooms;
    private List<Vegetables> vegetables;
    private List<Cheeses> cheeses;
    private List<Sauces> sauces;

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", meat=" + meat +
                ", mushrooms=" + mushrooms +
                ", vegetables=" + vegetables +
                ", cheeses=" + cheeses +
                ", sauces=" + sauces +
                '}';
    }

    public static final class Builder {

        private String name;
        private double price;
        private PizzaSize size;
        private List<Meat> meat;
        private List<Mushrooms> mushrooms;
        private List<Vegetables> vegetables;
        private List<Cheeses> cheeses;
        private List<Sauces> sauces;

        private Builder() {
        }

        public static Builder aPizza() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withSize(PizzaSize size) {
            this.size = size;
            return this;
        }

        public Builder withMeat(Meat... meat) {
            this.meat = List.of(meat);
            return this;
        }

        public Builder withMushrooms(Mushrooms... mushrooms) {
            this.mushrooms = List.of(mushrooms);
            return this;
        }

        public Builder withVegetables(Vegetables... vegetables) {
            this.vegetables = List.of(vegetables);
            return this;
        }

        public Builder withCheeses(Cheeses... cheeses) {
            this.cheeses = List.of(cheeses);
            return this;
        }

        public Builder withSauces(Sauces... sauces) {
            this.sauces = List.of(sauces);
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.size = this.size;
            pizza.vegetables = this.vegetables;
            pizza.meat = this.meat;
            pizza.name = this.name;
            pizza.mushrooms = this.mushrooms;
            pizza.price = this.price;
            pizza.cheeses = this.cheeses;
            pizza.sauces = this.sauces;
            return pizza;
        }
    }
}
