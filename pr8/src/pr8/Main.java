package pr8;

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drink d = new Drink(12, "Ice", "Tasty");
        InternetOrder io = new InternetOrder();
        RestaurantOrder ro = new RestaurantOrder();
        io.add(d);
        io.add(d);
        ro.add(d);
        InternetOrderManager iom = new InternetOrderManager();
        iom.add(io);
        iom.add(io);
        System.out.println("Total cost of order: "+io.costTotal()+" || Dishes in internet order: "+io.numberOfDishesByName(d.getNaming()));
        System.out.println("Total number of "+d.getNaming()+" in internet orders: "+iom.itemsQuantity(d.getNaming()));
        TablesOrderManager tom = new TablesOrderManager();
        tom.add(ro, 5);
        System.out.println("Total number of "+d.getNaming()+" in restaurant orders: "+tom.itemsQuantity(d.getNaming()));
        System.out.println("Free tables: "+tom.getFreeTables());
        System.out.println("Ocupied tables: "+tom.getOcupiedTables());
    }
}
