import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
       Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String inputStr = sc.nextLine();
        for(int i=inputStr.length()-1;i>=0;i--) {
            queue.add(inputStr.charAt(i));
        }
        String reverse="";
        while(!queue.isEmpty()){
            reverse = reverse+ queue.remove();
        }
        System.out.println(reverse);
        if(reverse.equals(inputStr))
            System.out.println("same");
        else
            System.out.println("different");

    }

}