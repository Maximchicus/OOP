package pr8;

import java.util.LinkedList;

public interface Order extends Customer{
    LinkedList<Item> items = new LinkedList<>();
    boolean add(Item item);
    boolean remove(String dishName);
    int removeAll(String dishName);
    int costTotal();
    LinkedList<Item> getDishes();
    String dishesNames();
    int numberOfDishesByName(String dishName);

}
