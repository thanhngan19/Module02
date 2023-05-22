import java.lang.reflect.Array;
import java.util.Scanner;

public class ex7_Sum_SquareMatrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input column and row of matrix: ");
        int n = Integer.parseInt(scanner.nextLine());
        int [][] Arr = new int [n][n];
        for(int i =0; i<Arr.length; i++){
            for (int j=0; j<Arr[i].length; j++){
                System.out.printf("Element is Arr[%d][%d]", i,j);
                Arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length;j++){
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length;j++){
                if(i == j){
                    sum+= Arr[i][j];
                }
            }
        }
        System.out.println("Sum of Main diagona is: "+ sum);

    }
}
