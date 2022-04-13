package L09_Composite.galaxy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StarSystem implements GalaxyComponent {

    private final String name;
    private final Star star;
    private final List<Planet> planets;

    public StarSystem(String name, Star star, List<Planet> planets) {
        this.name = name;
        this.star = star;
        this.planets = planets;
    }

    @Override
    public List<String> getComponentNames() {
        List<String> ids = new ArrayList<>();
        ids.add(name);
        ids.addAll(star.getComponentNames());
        ids.addAll(planets.stream()
                .flatMap(planet -> planet.getComponentNames().stream())
                .collect(Collectors.toList()));

        return ids;
    }
}
