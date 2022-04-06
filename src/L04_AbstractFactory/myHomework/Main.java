package L04_AbstractFactory.myHomework;

import L04_AbstractFactory.myHomework.furniture.FurnitureStyle;

public class Main {

    public static void main(String[] args) {
        FurnitureProvider furnitureProvider = new FurnitureProvider();

        System.out.println(furnitureProvider.getFurnitureSet(FurnitureStyle.VICTORIAN));
        System.out.println(furnitureProvider.getFurnitureSet(FurnitureStyle.MODERN));
        System.out.println(furnitureProvider.getFurnitureSet(FurnitureStyle.AR_DECO));

        System.out.println(furnitureProvider.getChair(FurnitureStyle.AR_DECO));
    }
}
