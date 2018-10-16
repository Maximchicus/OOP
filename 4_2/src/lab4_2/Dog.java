package lab4_2;
import java.util.*;

public class Dog implements Priceable{
    private int price;
    public void printPrice(){
        System.out.println(price);
    }
    public void setPrice(){
        Scanner sc = new Scanner(System.in);
        price = sc.nextInt();
    }
}
