package L10_Decorator.cocktails;

import java.util.Objects;

public class Ingredient {

    private final String type;
    private int quantity;

    public Ingredient(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
