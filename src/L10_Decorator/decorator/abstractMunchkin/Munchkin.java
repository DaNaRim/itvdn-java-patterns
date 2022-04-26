package L10_Decorator.decorator.abstractMunchkin;

public interface Munchkin {

    int strength = 1;
    int magic = 1;
    int healthPoints = 1;

    int getStrength();

    void setStrength(int strength);

    int getMagic();

    void setMagic(int magic);

    int getHealthPoints();

    void setHealthPoints(int healthPoints);

    String getStatus();

    String fight(Munchkin enemy);
}
