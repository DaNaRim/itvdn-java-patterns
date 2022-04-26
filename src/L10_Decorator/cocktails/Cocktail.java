package L10_Decorator.cocktails;

import java.util.Set;

public interface Cocktail {

    void addIngredient(Ingredient ingredient);

    void removeIngredient(Ingredient ingredient);

    Set<Ingredient> getIngredients();

    void setIngredients(Set<Ingredient> ingredients);

    double getPrice();

    void setPrice(double price);
}
