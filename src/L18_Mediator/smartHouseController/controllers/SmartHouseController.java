package L18_Mediator.smartHouseController.controllers;

import L18_Mediator.smartHouseController.model.*;

import java.util.Scanner;

public class SmartHouseController {

    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(Status.WARM);
        Kitchen kitchen = new Kitchen(Status.BURN_BABY_BURN);
        Garage garage = new Garage(Status.COLD);
        Mediator mediator = new Mediator(bedroom, garage, kitchen);

        String strMethod;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the method: ");

        while (!(strMethod = reader.nextLine()).equals("exit")) {
            switch (strMethod) {
                case "bedroom" -> mediator.manageTemperature(Room.BEDROOM);
                case "garage" -> mediator.manageTemperature(Room.GARAGE);
                case "kitchen" -> mediator.manageTemperature(Room.KITCHEN);
                case "all" -> mediator.manageTemperature(Room.ALL);
                case "outside" -> mediator.checkOutsideStatus();
                default -> System.out.println("Wrong method input! Try again");
            }
            System.out.println();
            System.out.print("Enter the method: ");
        }
        reader.close();
    }

}
