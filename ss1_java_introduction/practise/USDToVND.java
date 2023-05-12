package ss1_java_introduction.practise;

import java.util.Scanner;

public class USDToVND {
    public static void main(String[] args) {
        double VND = 23.000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần chuyển");
        double USD = Double.parseDouble(scanner.nextLine());
        System.out.println("Số tiền usd càn chuyển đổi là: "+ USD);
        double Trans = USD * VND;
        System.out.println("Số tiền Việt Nam sau khi chuyển là : " +Trans);
    }
}
