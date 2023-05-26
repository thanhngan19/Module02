package ss6.src.exercise2;

import ss6.src.exercise2.Point;

import java.awt.geom.Point2D;
import java.util.Arrays;

public  class Moveable_Point extends Point {
private float Speadx;
private float SpeadY;

    public Moveable_Point(float x, float y,float speadx, float speadY) {
        super(x,y);
        Speadx = speadx;
        SpeadY = speadY;
    }

    public Moveable_Point(float speadx, float speadY) {
        Speadx = speadx;
        SpeadY = speadY;
    }

    public Moveable_Point() {
    }

    public float getSpeadx() {
        return Speadx;
    }

    public void setSpeadx(float speadx) {
        Speadx = speadx;
    }

    public float getSpeadY() {
        return SpeadY;
    }

    public void setSpeadY(float speadY) {
        SpeadY = speadY;
    }
    public void setSpeed(float speadx, float speadY){
        Speadx = speadx;
        SpeadY = speadY;
    }
    public void  getSpeed(){
        float [] speed= new float[2];
        speed[0]=getSpeadx();
        speed[1]=getSpeadY();
        System.out.println(Arrays.toString(speed));
    }

    @Override
    public String toString() {
        return "Moveable_Point{" + "("+ super.getX() +","+super.getY()+")"+","+"speed= "+"("+getSpeadx()+","+getSpeadY()+")";
    }
    public Moveable_Point move(){
        setX(getX()+Speadx);
        setY(getY()+SpeadY);
        return this;
}}
