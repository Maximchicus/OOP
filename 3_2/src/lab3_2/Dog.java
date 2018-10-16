package lab3_2;
import java.lang.*;
import java.util.*;

public abstract class Dog {
    public int height;
    public int weight;
    public int length;

    public abstract void allOut();

}

class AkitaInu extends Dog{

    AkitaInu(){
        height = 0;
        weight = 0;
        length = 0;
    }

    public void allOut(){
        System.out.println("Height: "+height+"\nWeight: "+weight+"\nWeight: "+length);
    }
    public void setHeight(){
        System.out.println("Введите рост: ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
    }
    public void setWeight(){
        System.out.println("Введите вес: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextInt();
    }
    public void setLength() {
        System.out.println("Введите длину: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
    }
}
class Bulldog extends Dog{
    public void allOut(){
        System.out.println("Рост: "+height+"\nВес: "+weight+"\nДлина: "+length);
    }
    public void setHeight(){
        System.out.println("Введите рост: ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
    }
    public void setWeight(){
        System.out.println("Введите вес: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextInt();
    }
    public void setLength() {
        System.out.println("Введите длину: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
    }
}