package L10_Decorator.cocktails;

import java.util.Set;

public class SimpleCocktail implements Cocktail {

    private Set<Ingredient> ingredients;
    private double price;

    public SimpleCocktail(Set<Ingredient> ingredients, double price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "ingredients=" + ingredients +
                '}';
    }


}
