package L04_AbstractFactory.myHomework.factories;

import L04_AbstractFactory.myHomework.furniture.Chair;
import L04_AbstractFactory.myHomework.furniture.Furniture;
import L04_AbstractFactory.myHomework.furniture.Sofa;
import L04_AbstractFactory.myHomework.furniture.Table;
import L04_AbstractFactory.myHomework.furniture.modernFurniture.ModernChair;
import L04_AbstractFactory.myHomework.furniture.modernFurniture.ModernSofa;
import L04_AbstractFactory.myHomework.furniture.modernFurniture.ModernTable;

import java.util.List;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public List<Furniture> getFurnitureSet() {
        return List.of(
                new ModernChair(),
                new ModernChair(),
                new ModernSofa(),
                new ModernTable()
        );
    }

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}
