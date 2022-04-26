package L10_Decorator.decorator.standartCharacters;

import L10_Decorator.decorator.abstractMunchkin.Munchkin;
import L10_Decorator.decorator.advancedCharacters.Warrior;

public class Dwarf implements Munchkin {

    private int strength;
    private int magic;
    private int healthPoints;

    public Dwarf() {
        this.strength = Munchkin.strength + 15;
        this.magic = Munchkin.magic;
        this.healthPoints = Munchkin.healthPoints + 5;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getMagic() {
        return magic;
    }

    @Override
    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String getStatus() {
        return "The character is: " + this.getClass().getSimpleName() + "\n"
                + "strength: " + this.strength + "\n"
                + "magic: " + this.magic + "\n"
                + "health points: " + this.healthPoints + "\n";
    }

    @Override
    @SuppressWarnings("Duplicates")
    public String fight(Munchkin enemy) {
        while (this.healthPoints > 0) {
            enemy.setHealthPoints(enemy.getHealthPoints() - this.getStrength());
            if (enemy.getClass().equals(Warrior.class)
                    || enemy.getClass().equals(Human.class)
                    || enemy.getClass().equals(Dwarf.class)) {
                this.setHealthPoints(this.healthPoints - enemy.getStrength());
            } else {
                this.setHealthPoints(this.healthPoints - enemy.getMagic());
            }
        }
        return this.healthPoints > enemy.getHealthPoints() ? "You win!" : "You loose";
    }
}
