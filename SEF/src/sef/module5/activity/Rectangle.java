package sef.module5.activity;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(){ }

    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return this.length * this.breadth;
    }

    public double calculatePerimeter(){
        return 2*(this.length + this.breadth);
    }
}
