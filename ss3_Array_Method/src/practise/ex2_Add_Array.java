package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_Add_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array[%d]", i );
            Array[i] = Integer.parseInt(scanner.nextLine());
        }
        Scanner scanner1= new Scanner(System.in);
        System.out.println("thêm phần tử vào mảng có giá trị : ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("thêm vào vị trí index: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=0; i< Array.length; i++){
            if(i == index){
                Array[i] = value;
                for (int j= i; j< Array.length; j++) {
                    Array[j + 1] = Array[j];
                    System.out.print(Array[j+1]+ " ");
                }
            } else if(i!= index) {
                System.out.print(Array[i]+ " ");
            }
        }
    }
}
