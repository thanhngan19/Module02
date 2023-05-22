package practise;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Mời bạn nhập vào n: ");
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (n >= 0), Xin nhập lại!!!");
            }
        } while (n < 0);
        Student [] studentList = new Student[n];
        for (int i =0; i<studentList.length; i++){
            studentList[i] = new Student();
            System.out.printf("Nhập vào sinh viên thứ %d: ", i+1);
            System.out.print("Nhập vào tên: ");
            studentList[i].name= scanner.nextLine();
            System.out.print("Nhập vào điểm : ");
            studentList[i].score= Double.parseDouble(scanner.nextLine());
        }
for (int i=0; i<studentList.length;i++){
    System.out.printf("thông tin sinh viên thứ %d: ", i+1);
    System.out.println("tên : "+ studentList[i].name);
    System.out.println("Điểm : "+ studentList[i].score);
    studentList[i].run();


}
    }
}
