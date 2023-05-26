package ss6.src.exercise1;

public class Main {
    public static void main(String[] args) {
        Point2D pt2 = new Point2D(2,3);
        System.out.println(pt2.toString());
        pt2.getXY();
        Point3D pt3 = new Point3D(2,3,4);
        pt3.getXYZ();
        System.out.println(pt3.toString());
    }
}
