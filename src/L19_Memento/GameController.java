package L19_Memento;

import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {
        final SaveCard card = new SaveCard();
        BattleTank tank = new BattleTank();

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        String strMethod = reader.nextLine();

        while (!strMethod.equals("exit")) {
            switch (strMethod) {
                case "infantry" -> tank.attackInfantry();
                case "armored" -> tank.armoredVehicleAttack();
                case "catch shell" -> tank.getHit();
                case "mission complete" -> tank.finishMission();
                case "status" -> System.out.println(tank);
                case "get saves" -> card.showSaves();
                case "save" -> card.addSave(tank.saveGame());
                case "load" -> {
                    System.out.print("Enter the index of save: ");
                    strMethod = reader.nextLine();
                    if (strMethod.equals("back")) break;

                    tank.loadGame(card.loadSave(Integer.parseInt(strMethod)));
                }
                default -> System.out.println("Wrong action input! Try again");
            }
            System.out.println();
            System.out.print("Enter the action: ");
            strMethod = reader.nextLine();
        }
        reader.close();
    }
}
