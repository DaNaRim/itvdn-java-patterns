package L04_Abstract_factory.myHomework.factories;

import L04_Abstract_factory.myHomework.furniture.Chair;
import L04_Abstract_factory.myHomework.furniture.Furniture;
import L04_Abstract_factory.myHomework.furniture.Sofa;
import L04_Abstract_factory.myHomework.furniture.Table;
import L04_Abstract_factory.myHomework.furniture.modernFurniture.ModernChair;
import L04_Abstract_factory.myHomework.furniture.modernFurniture.ModernSofa;
import L04_Abstract_factory.myHomework.furniture.modernFurniture.ModernTable;

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
