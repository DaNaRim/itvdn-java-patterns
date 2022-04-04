package L02_Builder.homework;

public class Main {

    public static void main(String[] args) throws Exception {
        Cook cook = new Cook();

        Pizza pizza1 = cook.cookSpecialtyBravoPizza(PizzaSize.MAXI);
        Pizza pizza2 = cook.cookSpecialtyMeatPizza(PizzaSize.SOLO);
        Pizza pizza3 = cook.cookWhitePizza(PizzaSize.CLASSIC);

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
        System.out.println(pizza3.toString());
    }
}
