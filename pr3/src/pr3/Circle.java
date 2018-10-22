package pr3;

import java.util.Scanner;
import java.math.*;

public class Circle extends Shape{
    public int radius;
    public Circle(){};
    public Circle(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(){
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
    }
    public int getRadius(){
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return Math.PI*radius*2;
    }
    public String toString(){
        return "Цвет: " + color + "\nПлощадь: "+ getArea() + "\nПериметр: " + getPerimeter();
    }
}
