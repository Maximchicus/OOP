package lab4_2;

import java.util.Scanner;

public class Book implements Priceable{
    private int price;
    public void printPrice(){
        System.out.println(price);
    }
    public void setPrice(){
        Scanner sc = new Scanner(System.in);
        price = sc.nextInt();
    }
}
