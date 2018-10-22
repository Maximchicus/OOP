package pr3;

import java.util.Scanner;

public class Rectangle extends Shape {
    public int length, width;
    public Rectangle(){};
    public Rectangle(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setLength(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
    }
    public void setWidth(){
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return length;
    }
    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }
    public String toString(){
        return "Цвет: " + color + "\nПлощадь: "+ getArea() + "\nПериметр: " + getPerimeter();
    }
}
