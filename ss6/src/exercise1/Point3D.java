package ss6.src.exercise1;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void SetXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public void getXYZ() {
        float[] Arr3D = new float[3];
        Arr3D[0]=super.getX();
        Arr3D[1]=super.getY();
        Arr3D[2] = z;
        System.out.println(Arrays.toString(Arr3D));
    }

    @Override
    public String toString() {
        return "Point 3D: {"+"x="+super.getX()+","+ "y="+super.getY()+","+"z="+getZ()+"}";
    }
}
