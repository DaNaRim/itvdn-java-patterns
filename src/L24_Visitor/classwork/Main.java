package L24_Visitor.classwork;

import L24_Visitor.classwork.messages.LongInformation;
import L24_Visitor.classwork.messages.ShortInformation;
import L24_Visitor.classwork.messages.abstractions.Element;
import L24_Visitor.classwork.visitors.Ticker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Element> listOfMessages = new ArrayList<>();
        Ticker ticker = new Ticker();

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the method: ");
        String strMethod = reader.nextLine();

        while (!strMethod.equals("exit")) {
            switch (strMethod) {
                case "add" -> {
                    System.out.print("Enter information: ");
                    strMethod = reader.nextLine();
                    if (strMethod.length() < 10) {
                        listOfMessages.add(new ShortInformation(strMethod));
                    } else {
                        listOfMessages.add(new LongInformation(strMethod));
                    }
                }
                case "remove" -> {
                    System.out.print("Enter the number of information: ");
                    strMethod = reader.nextLine();
                    try {
                        listOfMessages.remove(Integer.parseInt(strMethod));
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong number format");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Wrong index");
                    }
                }
                case "print" -> {
                    listOfMessages.forEach(m -> {
                        if (m.getClass() == LongInformation.class) {
                            ticker.visit((LongInformation) m);
                        } else if (m.getClass() == ShortInformation.class) {
                            ticker.visit((ShortInformation) m);
                        } else {
                            System.out.println("Wrong format of information");
                        }
                    });
                    System.out.println(ticker);
                }
                default -> System.out.println("Wrong method! Try again");
            }
            System.out.println();
            System.out.print("Enter the method: ");
            strMethod = reader.nextLine();
        }
        reader.close();
    }
}
