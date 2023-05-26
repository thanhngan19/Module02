package exercise1.ex1_QuadraticEquation;

import java.util.Scanner;

import static java.lang.Math.pow;

//pow(a, b) = a^b
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public  QuadraticEquation(double a, double b,double c){//contructor k có giá trị trả về
        this.a= a;
        this.b=b;
        this.c=c;
    }
    public void seta(){
        this.a  = a;
    }
    public void setb(){
        this.b = b;
    }
    public void setc(){
        this.c = c;
    }
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c;
    }
    public double getDiscriminant(double a, double b, double c){ // muốn trả về giá trị, biến trrong class k cần khai báo nx
        double delta = (b*b) - 4*a*c;
        return delta;
    }
    public double getRoot1(double delta){
        double root1= (-b + pow(delta,0.5))/2*a;
        return root1;
    }
    public double getRoot2(double delta){
        double root2= (-b - pow(delta,0.5))/2*a;
        return root2;
    }
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập vào hệ số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập vào hệ số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập vào hệ số c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation pt2 = new QuadraticEquation(a,b,c);
        double delta = pt2.getDiscriminant(a,b,c);// gọi đối tượng đc khỏi tại vì hắn đã có tất cả tính chất class.
        if(delta>=0){
            double No1 = pt2.getRoot1(delta);
            System.out.println("nghiệm thứ nhất của phương trình là : "+ No1);
            double No2 = pt2.getRoot2(delta);
            System.out.println("nghiệm thứ nhất của phương trình là : "+ No2);
        }else if(delta <0){
            System.out.print("Phương trình vô nghiệm");
        }
    }
}


