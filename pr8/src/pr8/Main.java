package pr8;

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drink d = new Drink(12, "Ice", "Tasty");
        System.out.println(d.getCost());
        System.out.println(d.getNaming());
        System.out.println(d.getDescription());
    }
}
