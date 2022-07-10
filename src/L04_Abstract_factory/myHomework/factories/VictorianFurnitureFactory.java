package L04_Abstract_factory.myHomework.factories;

import L04_Abstract_factory.myHomework.furniture.Chair;
import L04_Abstract_factory.myHomework.furniture.Furniture;
import L04_Abstract_factory.myHomework.furniture.Sofa;
import L04_Abstract_factory.myHomework.furniture.Table;
import L04_Abstract_factory.myHomework.furniture.victorianFurniture.VictorianChair;
import L04_Abstract_factory.myHomework.furniture.victorianFurniture.VictorianSofa;
import L04_Abstract_factory.myHomework.furniture.victorianFurniture.VictorianTable;

import java.util.List;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public List<Furniture> getFurnitureSet() {
        return List.of(
                new VictorianChair(),
                new VictorianChair(),
                new VictorianSofa(),
                new VictorianTable()
        );
    }

    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table getTable() {
        return new VictorianTable();
    }
}
