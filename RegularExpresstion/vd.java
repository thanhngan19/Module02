package RegularExpresstion;

import java.util.Scanner;

public class vd {
    public static void main(String[] args) {
        String gender = gender();
        System.out.println(gender);
        }

    public static String gender(){
        Scanner sc = new Scanner(System.in);
        String gender1;
        while(true){
            System.out.println("Nhập vào giới tính: ");
            gender1 = sc.nextLine();

            if (gender1.equals("nam") || gender1.equals("nữ")) {
                return gender1;

            } else {
                System.out.println("giới tính k hợp lệ !!");

            }
    }
    }
}



