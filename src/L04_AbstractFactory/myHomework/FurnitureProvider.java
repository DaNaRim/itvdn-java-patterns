package L04_AbstractFactory.myHomework;

import L04_AbstractFactory.myHomework.factories.ArDecoFurnitureFactory;
import L04_AbstractFactory.myHomework.factories.FurnitureFactory;
import L04_AbstractFactory.myHomework.factories.ModernFurnitureFactory;
import L04_AbstractFactory.myHomework.factories.VictorianFurnitureFactory;
import L04_AbstractFactory.myHomework.furniture.*;

import java.util.List;

public class FurnitureProvider {

    private static final FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
    private static final FurnitureFactory modernFactory = new ModernFurnitureFactory();
    private static final FurnitureFactory arDecoFactory = new ArDecoFurnitureFactory();

    public List<Furniture> getFurnitureSet(FurnitureStyle style) {
        return switch (style) {
            case VICTORIAN -> victorianFactory.getFurnitureSet();
            case MODERN -> modernFactory.getFurnitureSet();
            case AR_DECO -> arDecoFactory.getFurnitureSet();
            default -> throw new RuntimeException("Unsupported furniture style");
        };
    }

    public Chair getChair(FurnitureStyle style) {
        return switch (style) {
            case VICTORIAN -> victorianFactory.getChair();
            case MODERN -> modernFactory.getChair();
            case AR_DECO -> arDecoFactory.getChair();
            default -> throw new RuntimeException("Unsupported furniture style");
        };
    }

    public Sofa getSofa(FurnitureStyle style) {
        return switch (style) {
            case VICTORIAN -> victorianFactory.getSofa();
            case MODERN -> modernFactory.getSofa();
            case AR_DECO -> arDecoFactory.getSofa();
            default -> throw new RuntimeException("Unsupported furniture style");
        };
    }

    public Table getTable(FurnitureStyle style) {
        return switch (style) {
            case VICTORIAN -> victorianFactory.getTable();
            case MODERN -> modernFactory.getTable();
            case AR_DECO -> arDecoFactory.getTable();
            default -> throw new RuntimeException("Unsupported furniture style");
        };
    }
}
