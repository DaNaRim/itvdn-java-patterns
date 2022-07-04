package L22_Strategy.classwork.strategies;

import L22_Strategy.classwork.domain.Order;

import java.util.List;

public class RegisteredOrderStrategy implements OrderStrategy {

    @Override
    public void approveShopCart(List<String> shoppingList, Order order) {
        order.setProductList(shoppingList);
        System.out.println("Shopping list of the order: " + order + " was approved");
    }

    @Override
    public void approveDeliveryInformation(String address, Order order) {
        System.out.println("Delivery information for logged user was found automatically");
    }

    @Override
    public void order(Order order) {
        System.out.println("Order was fully approved and taken into the work");
    }
}
