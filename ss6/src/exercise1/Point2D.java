package ss6.src.exercise1;

import java.util.Arrays;

public class Point2D {

        private float x;
        private float y ;

        public Point2D() {
        }

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y){
            this.x=x;
            this.y=y;
        }
        public void getXY(){
            float [] Arr2d = new float[2];
            Arr2d[0]=x;
            Arr2d[1]=y;
            System.out.println(Arrays.toString(Arr2d));
        }

        @Override
        public String toString() {
            return "Point2D: {" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }





