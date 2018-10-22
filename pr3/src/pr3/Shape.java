package pr3;

import java.awt.geom.Area;
import java.lang.System;
import java.util.Scanner;

public abstract class Shape {
    public String color;
    public boolean filled;
    public Shape(){};
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        Scanner sc = new Scanner(System.in);
        color = sc.nextLine();
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(){
        Scanner sc = new Scanner(System.in);
        filled = sc.nextBoolean();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
