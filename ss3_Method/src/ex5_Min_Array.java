import java.util.Arrays;
import java.util.Scanner;

public class ex5_Min_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng 1: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] Array1 = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.printf("phần tử của mảng Array[%d]", i);
            Array1[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = Array1[0];
        System.out.println(Arrays.toString(Array1));
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] < min) {
                min = Array1[i];
            }
        }
        System.out.println("Min in Array is: " + min);
    }
}
