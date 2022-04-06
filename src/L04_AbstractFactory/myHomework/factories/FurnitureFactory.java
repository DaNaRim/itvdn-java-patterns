package L04_AbstractFactory.myHomework.factories;

import L04_AbstractFactory.myHomework.furniture.Chair;
import L04_AbstractFactory.myHomework.furniture.Furniture;
import L04_AbstractFactory.myHomework.furniture.Sofa;
import L04_AbstractFactory.myHomework.furniture.Table;

import java.util.List;

public interface FurnitureFactory {

    List<Furniture> getFurnitureSet();

    Chair getChair();

    Sofa getSofa();

    Table getTable();
}
