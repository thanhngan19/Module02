import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        String str = sc.nextLine();
        Stack stackb = new Stack();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                stackb.push(str.charAt(i));
            }
        }
        System.out.println(stackb);
        int count = stackb.size();
        if (count == 0) {
            System.out.println("false");
        }else{
            int Num = 0;
            for(int i = 0; i <str.length(); i++){
                if(str.charAt(i) == '('){
                    Num++;
                }
            }
            if(Num == count){
                System.out.println("true");
            }
        }

    }
}
