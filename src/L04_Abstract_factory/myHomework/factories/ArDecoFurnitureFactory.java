package L04_Abstract_factory.myHomework.factories;

import L04_Abstract_factory.myHomework.furniture.Chair;
import L04_Abstract_factory.myHomework.furniture.Furniture;
import L04_Abstract_factory.myHomework.furniture.Sofa;
import L04_Abstract_factory.myHomework.furniture.Table;
import L04_Abstract_factory.myHomework.furniture.arDecoFurniture.ArDecoChair;
import L04_Abstract_factory.myHomework.furniture.arDecoFurniture.ArDecoSofa;
import L04_Abstract_factory.myHomework.furniture.arDecoFurniture.ArDecoTable;

import java.util.List;

public class ArDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public List<Furniture> getFurnitureSet() {
        return List.of(
                new ArDecoChair(),
                new ArDecoChair(),
                new ArDecoSofa(),
                new ArDecoTable()
        );
    }

    @Override
    public Chair getChair() {
        return new ArDecoChair();
    }

    @Override
    public Sofa getSofa() {
        return new ArDecoSofa();
    }

    @Override
    public Table getTable() {
        return new ArDecoTable();
    }
}
