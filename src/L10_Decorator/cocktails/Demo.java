package L10_Decorator.cocktails;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Set<Ingredient> ingredients1 = new HashSet<>(List.of(
                new Ingredient("one", 123),
                new Ingredient("two", 103),
                new Ingredient("three", 120)
        ));
        Set<Ingredient> ingredients2 = new HashSet<>(List.of(
                new Ingredient("one", 10),
                new Ingredient("four", 33)
        ));

        Cocktail cocktail = new SimpleCocktail(ingredients1, 100);
        Cocktail cocktail2 = new SimpleCocktail(ingredients2, 200);

        CocktailDecorator cd = new CocktailDecorator(cocktail);

        Cocktail mixedCocktail = cd.mix(cocktail2);
        System.out.println(mixedCocktail.toString());
    }
}
