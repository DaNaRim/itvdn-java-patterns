package L20_Observer;

import L20_Observer.controlPanelsSubscribers.MainControlPanel;
import L20_Observer.controlPanelsSubscribers.RemoteControlPanel;
import L20_Observer.controlPanelsSubscribers.Subscriber;
import L20_Observer.events.AirSupplySystemEvents;
import L20_Observer.events.FireSystemEvents;
import L20_Observer.events.PowerSystemEvents;
import L20_Observer.statuses.AirSystemStatus;
import L20_Observer.statuses.FireSystemStatus;
import L20_Observer.statuses.PowerSystemStatus;
import L20_Observer.systemsPublishers.AirSupplySystem;
import L20_Observer.systemsPublishers.FireSystem;
import L20_Observer.systemsPublishers.PowerSupplySystem;

import java.util.Scanner;

public class Main {

    private static final AirSupplySystemEvents airSupplySystemEvents = new AirSupplySystemEvents();
    private static final FireSystemEvents fireSystemEvents = new FireSystemEvents();
    private static final PowerSystemEvents powerSystemEvents = new PowerSystemEvents();

    private static final AirSupplySystem airSupplySystem = new AirSupplySystem(airSupplySystemEvents);
    private static final FireSystem fireSystem = new FireSystem(fireSystemEvents);
    private static final RemoteControlPanel remoteControlPanel = new RemoteControlPanel(airSupplySystem, fireSystem);
    private static final PowerSupplySystem powerSupplySystem = new PowerSupplySystem(powerSystemEvents);
    private static final MainControlPanel mainControlPanel = new MainControlPanel(airSupplySystem, fireSystem, powerSupplySystem);

    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the action: ");
        String action = reader.nextLine();

        while (!action.equals("exit")) {
            switch (action) {
                case "subscribe" -> processSubscribeSubscriber();
                case "unsubscribe" -> processUnsubscribeSubscriber();
                case "normal" -> {
                    airSupplySystem.setStatus(AirSystemStatus.NORMAL);
                    fireSystem.setStatus(FireSystemStatus.NORMAL);
                    powerSupplySystem.setStatus(PowerSystemStatus.NORMAL);
                }
                case "decompression" -> airSupplySystem.setStatus(AirSystemStatus.DECOMPRESSION);
                case "fire" -> fireSystem.setStatus(FireSystemStatus.FIRE);
                case "reactor" -> powerSupplySystem.setStatus(PowerSystemStatus.REACTOR_MALFUNCTION);
                case "electrical" -> powerSupplySystem.setStatus(PowerSystemStatus.AUXILIARY_ELECTRICAL_FAILURE);
                case "generator" -> powerSupplySystem.setStatus(PowerSystemStatus.GENERATOR_FAILURE);
                default -> System.out.println("Wrong action input! Try again");
            }
            System.out.println();
            System.out.print("Enter the action: ");
            action = reader.nextLine();
        }
        reader.close();
    }

    private static void processSubscribeSubscriber() {
        System.out.print("Enter the device-subscriber name: ");
        String subscriberAction = reader.nextLine();

        while (!subscriberAction.equals("back")) {
            switch (subscriberAction) {
                case "main" -> processSubscribePublisher(mainControlPanel);
                case "remote" -> processSubscribePublisher(remoteControlPanel);
                default -> System.out.println("Wrong device-publisher name input! Try again");
            }
            System.out.println();
            System.out.print("Enter the device-subscriber name: ");
            subscriberAction = reader.nextLine();
        }
    }

    private static void processSubscribePublisher(Subscriber subscriber) {
        System.out.print("Enter the system-publisher name: ");
        String publisherAction = reader.nextLine();

        while (!publisherAction.equals("back")) {
            switch (publisherAction) {
                case "air" -> airSupplySystem.subscribe(airSupplySystemEvents, subscriber);
                case "fire" -> fireSystem.subscribe(fireSystemEvents, subscriber);
                case "power" -> powerSupplySystem.subscribe(powerSystemEvents, subscriber);
                default -> System.out.println("Wrong system-publisher name input! Try again");
            }
            System.out.println();
            System.out.print("Enter the system-publisher name: ");
            publisherAction = reader.nextLine();
        }
    }

    private static void processUnsubscribeSubscriber() {
        System.out.print("Enter the device-subscriber name to unsubscribe: ");
        String subscriberAction = reader.nextLine();

        while (!subscriberAction.equals("back")) {
            switch (subscriberAction) {
                case "main" -> processUnsubscribePublisher(mainControlPanel);
                case "remote" -> processUnsubscribePublisher(remoteControlPanel);
                default -> System.out.println("Wrong device-subscriber name input! Try again");
            }
            System.out.println();
            System.out.print("Enter the device-subscriber name to unsubscribe: ");
            subscriberAction = reader.nextLine();
        }
    }

    private static void processUnsubscribePublisher(Subscriber subscriber) {
        System.out.print("Enter the system-publisher name to unsubscribe: ");
        String publisherAction = reader.nextLine();

        while (!publisherAction.equals("back")) {
            switch (publisherAction) {
                case "air" -> airSupplySystem.unSubscribe(airSupplySystemEvents, subscriber);
                case "fire" -> fireSystem.unSubscribe(fireSystemEvents, subscriber);
                case "power" -> powerSupplySystem.unSubscribe(powerSystemEvents, subscriber);
                default -> System.out.println("Wrong system-publisher name to unsubscribe input! Try again");
            }
            System.out.println();
            System.out.print("Enter the system-publisher name to unsubscribe: ");
            publisherAction = reader.nextLine();
        }
    }
}
