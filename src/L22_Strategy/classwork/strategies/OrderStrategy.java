package L22_Strategy.classwork.strategies;

import L22_Strategy.classwork.domain.Order;

import java.util.List;

public interface OrderStrategy {

    void approveShopCart(List<String> shoppingList, Order order);

    void approveDeliveryInformation(String address, Order order);

    void order(Order order);
}
