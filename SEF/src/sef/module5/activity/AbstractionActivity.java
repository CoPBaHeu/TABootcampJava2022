package sef.module5.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.setColor("blue");

        Circle circle = new Circle(5);
        circle.setColor("red");

        System.out.println("-----Our rectangle is-----");
        System.out.println("Rectangle color is: " + rectangle.getColor());
        System.out.println("Rectangle area is: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is: " + rectangle.calculatePerimeter());

        System.out.println("-----Our circle is-----");
        System.out.println("Circle color is: " + circle.getColor());
        System.out.println("Circle area is: " + circle.calculateArea());
        System.out.println("Circle perimeter is: " + circle.calculatePerimeter());
    }
}
