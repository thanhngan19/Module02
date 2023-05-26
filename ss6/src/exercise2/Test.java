package ss6.src.exercise2;


public class Test {
    public static void main(String[] args) {
        Point pt = new Moveable_Point(2, 3, 4, 5);
//        System.out.println(pt.toString());
//        pt.setX(5);
//        ((Moveable_Point) pt).setSpeed(4,5);
        System.out.println(((Moveable_Point) pt).move());
    }
}
