package L04_AbstractFactory.myHomework.factories;

import L04_AbstractFactory.myHomework.furniture.Chair;
import L04_AbstractFactory.myHomework.furniture.Furniture;
import L04_AbstractFactory.myHomework.furniture.Sofa;
import L04_AbstractFactory.myHomework.furniture.Table;
import L04_AbstractFactory.myHomework.furniture.arDecoFurniture.ArDecoChair;
import L04_AbstractFactory.myHomework.furniture.arDecoFurniture.ArDecoSofa;
import L04_AbstractFactory.myHomework.furniture.arDecoFurniture.ArDecoTable;

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
