package pr3;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Красный", true);
        Rectangle r = new Rectangle("Синий", true);
        Square s = new Square("Зеленый", false);
        System.out.println("Circle");
        c.setRadius();
        System.out.println(c.toString());
        System.out.println("Rectangle");
        r.getLength();
        r.getWidth();
        System.out.println(r.toString());
        System.out.println("Square");
        r.getWidth();
        System.out.println(s.toString());
    }
}
