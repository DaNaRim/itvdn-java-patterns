package L21_State;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        FlightControlSystem flightControlSystem = new FlightControlSystem();

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        String strMethod = reader.nextLine();

        while (!strMethod.equals("exit")) {

            switch (strMethod) {
                case "take off" -> flightControlSystem.takeOff();
                case "climb" -> {
                    System.out.print("Enter the altitude: ");
                    String altitude = reader.nextLine();

                    while (!altitude.equals("back")) {

                        if (!Pattern.matches("\\d*", altitude)) {
                            System.out.println("Wrong number format");
                            System.out.print("Enter the altitude: ");
                            altitude = reader.nextLine();
                            continue;
                        }

                        int alt = Integer.parseInt(altitude);
                        if (alt <= flightControlSystem.getState().getAltitude()) {
                            System.out.println("unable climb to altitude below current");
                            System.out.print("Enter the altitude: ");
                            altitude = reader.nextLine();
                            continue;
                        }
                        flightControlSystem.climb(alt);
                        break;
                    }
                }
                case "descend" -> {
                    System.out.print("Enter the altitude: ");
                    String altitude = reader.nextLine();

                    while (!altitude.equals("back")) {

                        if (!Pattern.matches("\\d*", altitude)) {
                            System.out.println("Wrong number format");
                            System.out.print("Enter the altitude: ");
                            altitude = reader.nextLine();
                            continue;
                        }

                        int alt = Integer.parseInt(altitude);
                        if (alt >= flightControlSystem.getState().getAltitude()) {
                            System.out.println("unable descent to altitude higher current");
                            System.out.print("Enter the altitude: ");
                            altitude = reader.nextLine();
                            continue;
                        }

                        flightControlSystem.descend(alt);
                        break;
                    }
                }
                case "land" -> flightControlSystem.land();
                case "status" -> flightControlSystem.getStatusOfFlight();
                default -> System.out.println("Wrong action input! Try again");
            }
            System.out.println();
            System.out.print("Enter the action: ");
            strMethod = reader.nextLine();
        }
        reader.close();
    }
}

