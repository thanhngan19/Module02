package ss2_array_loop.practise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int len =1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhâp: ");
        int Amount = Integer.parseInt(scanner.nextLine());
        for (int i =2; ;i++){
            int count=0;
            for (int n=1; n<i; n++){
                if(i %n ==0 ){
                    count ++;
                }
            }
            if(count ==1 ){
                System.out.print(i+ " ");
                len++;
                if (len > Amount){
                    break;
                }
            }
        }
    }
}
