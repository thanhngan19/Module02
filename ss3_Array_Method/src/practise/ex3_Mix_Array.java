package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_Mix_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng 1: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array1 = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array[%d]", i );
            Array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(Array1));

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng 2: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[] Array2 = new int[m];
        for (int j = 0; j < m; j++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array[%d]", j);
            Array2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(Array2));
        int [] mixArr = new int [m+n];
        for(int i=0; i<Array1.length; i++){
            mixArr[i]= Array1[i];
        }
        for(int j= n; j<mixArr.length; j++){
            mixArr[j]=Array2[j-n];
        }
        System.out.println("Mix Array: "+Arrays.toString(mixArr));
    }
}
