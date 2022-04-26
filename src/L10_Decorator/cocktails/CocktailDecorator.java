package L10_Decorator.cocktails;

import java.util.HashSet;
import java.util.Set;

public class CocktailDecorator implements Cocktail {

    private final Cocktail cocktail;

    public CocktailDecorator(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        cocktail.addIngredient(ingredient);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        cocktail.removeIngredient(ingredient);
    }

    @Override
    public Set<Ingredient> getIngredients() {
        return cocktail.getIngredients();
    }

    @Override
    public void setIngredients(Set<Ingredient> ingredients) {
        cocktail.setIngredients(ingredients);
    }

    @Override
    public double getPrice() {
        return cocktail.getPrice();
    }

    @Override
    public void setPrice(double price) {
        cocktail.setPrice(price);
    }

    public Cocktail mix(Cocktail c2) {
        Set<Ingredient> mix = new HashSet<>(cocktail.getIngredients());

        for (Ingredient ingredient : c2.getIngredients()) {
            if (mix.contains(ingredient)) {
                Ingredient mixedIngr = getFromSet(mix, ingredient);

                mixedIngr.setQuantity(mixedIngr.getQuantity() + ingredient.getQuantity());

                mix.remove(mixedIngr);
                mix.add(mixedIngr);
            } else {
                mix.add(ingredient);
            }
        }
        double newPrice = cocktail.getPrice() + c2.getPrice() * 0.6;

        cocktail.setIngredients(mix);
        cocktail.setPrice(newPrice);

        return cocktail;
    }

    private Ingredient getFromSet(Set<Ingredient> set, Ingredient ingr) {
        for (Ingredient ingredient : set) {
            if (ingredient.equals(ingr)) return ingredient;
        }
        return null;
    }
}
