package sef.module5.activity;

public class Circle extends Shape{
    private double radius;

    public Circle(){ }

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return this.radius * this.radius * 3.14;
    }
    public double calculatePerimeter(){
        return 2 * this.radius * 3.14;
    }
}
