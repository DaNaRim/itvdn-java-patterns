package L12_Flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LegoBox extends JFrame {

    private static final List<LegoBrick> legoBricks = new ArrayList<>();

    public void dropLegoBrick(int x, int y, String name, Colors color, String otherLegoBrickData) {
        LegoType type = LegoFactory.getLegoType(name, color, otherLegoBrickData);
        LegoBrick legoBrick = new LegoBrick(x, y, type);
        legoBricks.add(legoBrick);
    }

    @Override
    public void paint(Graphics graphics) {
        for (LegoBrick legoBrick : legoBricks) {
            legoBrick.draw(graphics);
        }
    }
}
