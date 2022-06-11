package L09_Composite.galaxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Planet> planets1 = List.of(
                new Planet("Mercury"),
                new Planet("Venus"),
                new Planet("Earth")
        );
        List<Planet> planets2 = List.of(
                new Planet("Mars"),
                new Planet("Jupiter"),
                new Planet("Saturn")
        );
        StarSystem system = new StarSystem(
                "Sun system",
                new Star("Sun"),
                planets1
        );

        List<GalaxyComponent> components = new ArrayList<>(planets2);
        components.add(system);

        PartOfGalaxy pg = new PartOfGalaxy("inner", components);

        List<GalaxyComponent> components2 = new ArrayList<>();
        components2.add(pg);
        components2.add(new Star("single star"));

        PartOfGalaxy pg2 = new PartOfGalaxy("outer", components2);

        System.out.println(pg2.getComponentNames());
    }
}
