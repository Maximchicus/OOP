package pr8;

import java.util.LinkedList;

public class InternetOrderManager implements OrderManager {
    LinkedList<Order> orders = new LinkedList<>();

    public void add(Order or){
        orders.add(or);
    }

    public void remove(Order or){
        orders.remove(or);
    }

    @Override
    public int itemsQuantity(String name) {
        int c=0;
        for(Order o : orders){
            c+=o.numberOfDishesByName(name);
        }
        return c;
    }

    @Override
    public int itemsQuantity(Item item) {
        int c=0;
        for(Order o : orders){
            for(Item i : o.getDishes()){
                if(i==item) c++;
            }
        }
        return c;
    }

    @Override
    public LinkedList<Order> getOrders() {
        return orders;
    }

    @Override
    public int orderCostSummary() {
        int c=0;
        for(Order o : orders){
            c+=o.costTotal();
        }
        return c;
    }

    @Override
    public int ordersQuantity() {
        return orders.size();
    }
}
