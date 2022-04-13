package L09_Composite.galaxy;

import java.util.List;

public class Star implements GalaxyComponent {

    private final String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public List<String> getComponentNames() {
        return List.of(name);
    }
}
