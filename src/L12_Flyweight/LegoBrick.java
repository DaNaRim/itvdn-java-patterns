package L12_Flyweight;

import java.awt.*;

public class LegoBrick {
    private int x;
    private int y;
    private LegoType type;

    public LegoBrick(int x, int y, LegoType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
