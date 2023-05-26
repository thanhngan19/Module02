package ss7_Interface.src.exercise2;

import ss7_Interface.src.exercise1.Shape;
import ss7_Interface.src.exercise1.seize;

public class Square extends Shape implements Colorable {
    private double n = 1.0;


    public Square() {
    }

    public Square(double n) {
       this.n=n;
    }

    public Square(double n, String color, boolean filled) {
        super(color, filled);
        this.n=n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getArea() {
        return n*n;
    }

    public double getPerimeter() {
        return 2 * (n+n);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getN()
                + " and length="
                + getN()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }
}
