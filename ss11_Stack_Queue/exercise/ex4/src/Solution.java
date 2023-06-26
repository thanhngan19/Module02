import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input: ");
        int n = Integer.parseInt(s.nextLine());
        Stack<Integer> stack = new Stack();
        while(n!=0){
            stack.push(n%2);
            n=n/2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }


    }

}
