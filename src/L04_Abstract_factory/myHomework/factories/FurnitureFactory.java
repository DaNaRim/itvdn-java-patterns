package L04_Abstract_factory.myHomework.factories;

import L04_Abstract_factory.myHomework.furniture.Chair;
import L04_Abstract_factory.myHomework.furniture.Furniture;
import L04_Abstract_factory.myHomework.furniture.Sofa;
import L04_Abstract_factory.myHomework.furniture.Table;

import java.util.List;

public interface FurnitureFactory {

    List<Furniture> getFurnitureSet();

    Chair getChair();

    Sofa getSofa();

    Table getTable();
}
