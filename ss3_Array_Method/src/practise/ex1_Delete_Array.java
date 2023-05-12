package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ex1_Delete_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array[%d]", i + 1);
            Array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(Array));
        System.out.println("Nhập vào phần tử muốn xoá : ");
        int numDe = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<Array.length;i++){
            if(Array[i] == numDe){
                int index_de = i;
//                System.out.println("chỉ số phần tử muốn xoá trong mảng: " + index_de );
                for (int j = index_de; j<Array.length; j++){
                    Array[j]=Array[j+1];
                    System.out.print(Array[j]+ " ");
                }
            }
            else if (Array[i] != numDe) {
                System.out.print(Array[i]+ " ");
            }

        }

    }

}


