package L10_Decorator.decorator.advancedCharacters;

import L10_Decorator.decorator.abstractMunchkin.Munchkin;
import L10_Decorator.decorator.standartCharacters.Dwarf;
import L10_Decorator.decorator.standartCharacters.Human;

public class Warrior implements Munchkin {

    private Munchkin warrior;

    public Warrior(Munchkin warrior) {
        this.warrior = warrior;
        this.warrior.setStrength(warrior.getStrength() + 20);
        this.warrior.setHealthPoints(warrior.getHealthPoints() + 10);
    }

    @Override
    public int getStrength() {
        return warrior.getStrength();
    }

    @Override
    public void setStrength(int strength) {
        warrior.setStrength(strength);
    }

    @Override
    public int getMagic() {
        return warrior.getMagic();
    }

    @Override
    public void setMagic(int magic) {
        warrior.setMagic(magic);
    }

    @Override
    public int getHealthPoints() {
        return warrior.getHealthPoints();
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        warrior.setHealthPoints(healthPoints);
    }

    @Override
    public String getStatus() {
        return "The character is: " + this.getClass().getSimpleName() + "-" + warrior.getClass().getSimpleName() + "\n"
                + "strength: " + warrior.getStrength() + "\n"
                + "magic: " + warrior.getMagic() + "\n"
                + "health points: " + warrior.getHealthPoints() + "\n";
    }

    @Override
    public String fight(Munchkin enemy) {
        while (warrior.getHealthPoints() > 0) {
            enemy.setHealthPoints(enemy.getHealthPoints() - warrior.getStrength());
            if (enemy.getClass().equals(Warrior.class)
                    || enemy.getClass().equals(Human.class)
                    || enemy.getClass().equals(Dwarf.class)) {
                warrior.setHealthPoints(warrior.getHealthPoints() - enemy.getStrength());
            } else {
                warrior.setHealthPoints(warrior.getHealthPoints() - enemy.getMagic());
            }
        }
        return warrior.getHealthPoints() > enemy.getHealthPoints() ? "You win!" : "You loose";
    }

}
