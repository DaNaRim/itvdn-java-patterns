package L10_Decorator.decorator.standartCharacters;

import L10_Decorator.decorator.abstractMunchkin.Munchkin;
import L10_Decorator.decorator.advancedCharacters.Warrior;

public class Elf implements Munchkin {

    private int strength;
    private int magic;
    private int healthPoints;

    public Elf() {
        this.strength = Munchkin.STRENGTH;
        this.magic = Munchkin.MAGIC + 12;
        this.healthPoints = Munchkin.HEALTH_POINTS + 4;
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
            enemy.setHealthPoints(enemy.getHealthPoints() - this.getMagic());
            if (enemy.getClass() == Warrior.class
                    || enemy.getClass() == Human.class
                    || enemy.getClass() == Dwarf.class) {
                this.healthPoints -= enemy.getStrength();
            } else {
                this.healthPoints -= enemy.getMagic();
            }
        }
        return this.healthPoints > enemy.getHealthPoints() ? "You win!" : "You loose";
    }
}
