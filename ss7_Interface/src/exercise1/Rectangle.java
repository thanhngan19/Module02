package ss7_Interface.src.exercise1;

public class Rectangle extends Shape implements seize {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("độ dài sau khi thay đổi : "+ getLength()*percent);
        System.out.println("độ rộng sau khi thay đổi : "+ getWidth()*percent);
        System.out.println("chu vi sau đổi là : "+ getPerimeter()*percent);
        System.out.println("diện tích sau đổi là : "+ getArea()*percent);
    }
}
