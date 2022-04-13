package L09_Composite.galaxy;

import java.util.List;

public class Planet implements GalaxyComponent {

    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public List<String> getComponentNames() {
        return List.of(name);
    }
}
