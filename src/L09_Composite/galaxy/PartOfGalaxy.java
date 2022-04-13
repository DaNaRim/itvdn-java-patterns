package L09_Composite.galaxy;

import java.util.List;
import java.util.stream.Collectors;

public class PartOfGalaxy implements GalaxyComponent {

    private final String name;
    private final List<GalaxyComponent> components;

    public PartOfGalaxy(String name, List<GalaxyComponent> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public List<String> getComponentNames() {
        List<String> ids = components.stream()
                .flatMap(component -> component.getComponentNames().stream())
                .collect(Collectors.toList());

        ids.add(name);
        return ids;
    }
}
