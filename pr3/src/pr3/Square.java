package pr3;

public class Square extends Rectangle {
    public Square(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public double getArea() {
        length = width;
        return width*length;
    }

    public double getPerimeter() {
        length = width;
        return (width+length)*2;
    }
    public String toString(){
        return "Цвет: " + color + "\nПлощадь: "+ getArea() + "\nПериметр: " + getPerimeter();
    }
}
