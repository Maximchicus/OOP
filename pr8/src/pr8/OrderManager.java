package pr8;

import java.util.LinkedList;

public interface OrderManager{
    int itemsQuantity(String name);
    int itemsQuantity(Item item);
    LinkedList<Order> getOrders();
    int orderCostSummary();
    int ordersQuantity();
    void add(Order or);
    void remove(Order or);
}
