package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_Mix_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng1 : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array1 = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array1[%d]", i );
            Array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng 1 là : "+ Arrays.toString(Array1));
        System.out.print("Nhập vào độ dài mảng 2: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[] Array2 = new int[m];
        for (int i = 0; i < m; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array2[%d]", i );
            Array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng 2 là : "+ Arrays.toString(Array2));
        int [] Array3 = new int[m+n];
    }
}
