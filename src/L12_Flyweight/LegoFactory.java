package L12_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class LegoFactory {

    private static final Map<String, LegoType> legoTypes = new HashMap<>();

    public static LegoType getLegoType(String name, Colors color, String otherTreeData) {
        LegoType result = legoTypes.get(name);
        if (result == null) {
            result = new LegoType(name, color, otherTreeData);
            legoTypes.put(name, result);
        }
        return result;
    }
}
