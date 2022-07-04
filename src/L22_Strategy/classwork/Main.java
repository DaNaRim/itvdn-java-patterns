package L22_Strategy.classwork;

import L22_Strategy.classwork.domain.Order;
import L22_Strategy.classwork.domain.User;
import L22_Strategy.classwork.managers.OrderManager;
import L22_Strategy.classwork.strategies.RegisteredOrderStrategy;
import L22_Strategy.classwork.strategies.UnregisteredOrderStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> productList = new ArrayList<>();
        int orderCount = 0;
        User authorizedUser = null;

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the action: ");
        String strMethod = reader.nextLine();

        while (!strMethod.equals("exit")) {
            switch (strMethod) {
                case "order" -> {
                    System.out.print("Enter the product: ");
                    String product = reader.nextLine();

                    while (!product.equals("stop")) {
                        productList.add(product);

                        System.out.print("Enter the product: ");
                        product = reader.nextLine();
                    }
                }
                case "login" -> {
                    System.out.print("Enter the User name: ");
                    String name = reader.nextLine();

                    System.out.print("Enter the User address: ");
                    String address = reader.nextLine();

                    authorizedUser = new User(name, address);
                    System.out.println("You have been logged in");
                }
                case "logout" -> {
                    authorizedUser = null;
                    System.out.println("You have been logged out");
                }
                case "place" -> {
                    orderCount++;
                    if (authorizedUser != null) {
                        OrderManager<RegisteredOrderStrategy> orderManager = new OrderManager<>(RegisteredOrderStrategy::new);
                        orderManager.placeOrder(productList, new Order("Order for: " + authorizedUser.getName()), authorizedUser.getAddress());
                    } else {
                        System.out.print("Enter the User address: ");
                        String address = reader.nextLine();

                        OrderManager<UnregisteredOrderStrategy> orderManager = new OrderManager<>(UnregisteredOrderStrategy::new);
                        orderManager.placeOrder(productList, new Order("order" + orderCount), address);
                    }
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
