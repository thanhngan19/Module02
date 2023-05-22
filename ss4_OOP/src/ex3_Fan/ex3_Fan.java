package ex3_Fan;

public class ex3_Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed=SLOW;
    private boolean on = false;
    private double R =5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getR() {
        return R;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setR(double r) {
        this.R = R;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ex3_Fan() {
        this.speed = speed;
        this.on = on;
        this.R = R;
        this.color = color;
    }
    public void toString(boolean on,int speed,  double r, String color){
        if(on){
            System.out.println("fan is on ");
            System.out.println("tốc độ của quạt: "+speed);
            System.out.println("màu của quạt: "+color);
            System.out.println("bán kính của quạt: "+r);
        }
        else{
            System.out.println("fan is off ");
            System.out.println("tốc độ của quạt: "+speed);
            System.out.println("màu của quạt: "+color);
            System.out.println("bán kính của quạt: "+r);
        }

}

    public static void main(String[] args) {

        ex3_Fan st1 = new ex3_Fan();
        System.out.println("Quạt số 1");
        st1.toString(true,2,2,"yellow");
        ex3_Fan st2 = new ex3_Fan();
        System.out.println("Quạt số 2");
        st2.toString(false,3,3,"blue");

    }
}
