package exercise;

import static java.lang.Math.pow;

public class ex1_AccessModifier {
    private double radius =1.0;
    private String color ="red";
    private static final double PI= 3.14159265359;

    public ex1_AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <0){
            System.out.println("invalid");
        }else{
            this.radius=radius;
        }
    }
    public double getArea(double radius){
        double area = pow(radius,2)* PI;
        return area;
    }

    public static void main(String[] args) {
        ex1_AccessModifier st1 = new ex1_AccessModifier(15,"yelow");
        System.out.println("color of circle : " +st1.getColor());
        System.out.println("area of circle is: "+ st1.getArea(15));
    }
}
