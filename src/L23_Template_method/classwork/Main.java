package L23_Template_method.classwork;

import L23_Template_method.classwork.abstravtions.AbstractTimer;
import L23_Template_method.classwork.algorithms.KitchenTimer;
import L23_Template_method.classwork.algorithms.StopWatch;
import L23_Template_method.classwork.algorithms.WorkTimer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the timer you need: ");
        String strMethod = reader.nextLine();

        while (!strMethod.equals("exit")) {

            AbstractTimer timer;
            switch (strMethod) {
                case "kitchen" -> {
                    timer = new KitchenTimer();
                    System.out.print("Enter the time you need: ");
                    try {
                        int kitchenTime = Integer.parseInt(reader.nextLine());
                        timer.startTimer(kitchenTime);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                    }
                }
                case "work" -> {
                    timer = new WorkTimer();
                    System.out.print("Enter your work day duration: ");
                    try {
                        int workTime = Integer.parseInt(reader.nextLine());
                        timer.startTimer(workTime);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                    }
                }
                case "sec" -> {
                    timer = new StopWatch();
                    System.out.print("Enter the time you need: ");
                    try {
                        int secTime = Integer.parseInt(reader.nextLine());
                        timer.startTimer(secTime);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                    }
                }
                default -> System.out.println("Wrong timer input! Try again");
            }
            System.out.println();
            System.out.print("Enter the timer you need: ");
            strMethod = reader.nextLine();
        }
        reader.close();
    }
}
