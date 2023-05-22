import java.util.Scanner;

public class ex6_SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Column: ");
        int Column = Integer.parseInt(scanner.nextLine());
        System.out.println("Row: ");
        int Row = Integer.parseInt(scanner.nextLine());
        int [][] Arr = new int [Row][Column];
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length;j++){
                Scanner scanner1= new Scanner(System.in);
                System.out.printf("Arr[%d][%d]: ",i, j);
                Arr[i][j]= Integer.parseInt(scanner.nextLine());
            }

        }
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length;j++){
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập vào số cột muốn tính tổng");
        int n= Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i =0; i<Arr.length; i++){
            sum+= Arr[i][n];
        }
        System.out.printf("Sum of %d is: %d",n,sum);
    }

}
