package pr8;

import java.util.LinkedList;

public class TablesOrderManager implements OrderManager {
    LinkedList<Order> orders = new LinkedList<>();
    private int[] freeTables = new int[10];

    TablesOrderManager(){
        setTablesFree();
    }
    public String getFreeTables(){
        String str = "";
        for(int i=0; i<freeTables.length; i++) {
            if(freeTables[i]!=1) str= str + i + ", ";
        }
        return str;
    }
    public String getOcupiedTables(){
        String str = "";
        for(int i=0; i<freeTables.length; i++) {
            if(freeTables[i]==1) str= str + i + "\n";
        }
        return str;
    }
    public void add(Order or){
        orders.add(or);
    }
    public void add(RestaurantOrder or, int table){
        or.setTableNum(table);
        orders.add(or);
        freeTables[table] = 1;
    }
    public void remove(Order or){
        orders.remove(or);
    }
    public void setTablesFree(){
        for(int i=0; i<freeTables.length; i++) freeTables[i] = 0;
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
