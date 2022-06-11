package L10_Decorator.decorator.abstractMunchkin;

public interface Munchkin {

    int STRENGTH = 1;
    int MAGIC = 1;
    int HEALTH_POINTS = 1;

    int getStrength();

    void setStrength(int strength);

    int getMagic();

    void setMagic(int magic);

    int getHealthPoints();

    void setHealthPoints(int healthPoints);

    String getStatus();

    String fight(Munchkin enemy);
}
