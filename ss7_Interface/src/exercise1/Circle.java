package ss7_Interface.src.exercise1;

import java.util.Scanner;

public class Circle extends Shape implements seize{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("kích thước sau là : "+ percent* radius);
        System.out.println("diện tích sau khi thay đổi: "+ getArea()*percent);
        System.out.println("chu vi sau khi thay đổi : "+ getPerimeter()*percent);
    }
}
