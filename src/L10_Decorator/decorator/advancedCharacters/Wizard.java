package L10_Decorator.decorator.advancedCharacters;

import L10_Decorator.decorator.abstractMunchkin.Munchkin;
import L10_Decorator.decorator.standartCharacters.Dwarf;
import L10_Decorator.decorator.standartCharacters.Human;

public class Wizard implements Munchkin {

    private final Munchkin wizard;

    public Wizard(Munchkin wizard) {
        this.wizard = wizard;
        this.wizard.setMagic(wizard.getMagic() + 20);
        this.wizard.setHealthPoints(wizard.getHealthPoints() + 8);
    }

    @Override
    public int getStrength() {
        return wizard.getStrength();
    }

    @Override
    public void setStrength(int strength) {
        wizard.setStrength(strength);
    }

    @Override
    public int getMagic() {
        return wizard.getMagic();
    }

    @Override
    public void setMagic(int magic) {
        wizard.setMagic(magic);
    }

    @Override
    public int getHealthPoints() {
        return wizard.getHealthPoints();
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        wizard.setHealthPoints(healthPoints);
    }

    @Override
    public String getStatus() {
        return "The character is: " + this.getClass().getSimpleName() + "-" + wizard.getClass().getSimpleName() + "\n"
                + "strength: " + wizard.getStrength() + "\n"
                + "magic: " + wizard.getMagic() + "\n"
                + "health points: " + wizard.getHealthPoints() + "\n";
    }

    @Override
    public String fight(Munchkin enemy) {
        while (wizard.getHealthPoints() > 0) {
            enemy.setHealthPoints(enemy.getHealthPoints() - wizard.getMagic());
            if (enemy.getClass() == Warrior.class
                    || enemy.getClass() == Human.class
                    || enemy.getClass() == Dwarf.class) {
                wizard.setHealthPoints(wizard.getHealthPoints() - enemy.getStrength());
            } else {
                wizard.setHealthPoints(wizard.getHealthPoints() - enemy.getMagic());
            }
        }
        return wizard.getHealthPoints() > enemy.getHealthPoints() ? "You win!" : "You loose";
    }
}
