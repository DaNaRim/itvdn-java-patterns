package L10_Decorator.decorator;

import L10_Decorator.decorator.abstractMunchkin.Munchkin;
import L10_Decorator.decorator.advancedCharacters.Warrior;
import L10_Decorator.decorator.advancedCharacters.Wizard;
import L10_Decorator.decorator.standartCharacters.Dwarf;
import L10_Decorator.decorator.standartCharacters.Elf;

public class Demo {

    public static void main(String[] args) {

        //Munchkin myMunchkin = new Dwarf();
        //Munchkin enemy = new Elf();

        Munchkin myMunchkin = new Warrior(new Dwarf());
        Munchkin enemy = new Wizard(new Elf());
        Munchkin superChar = new Warrior(new Wizard(new Dwarf()));

        /*System.out.println(myMunchkin.getStatus());
        System.out.println();
        System.out.println(enemy.getStatus());
        System.out.println();
        System.out.println(myMunchkin.fight(enemy));*/

        System.out.println(superChar.getStatus());
        System.out.println(myMunchkin.fight(superChar));
    }
}
