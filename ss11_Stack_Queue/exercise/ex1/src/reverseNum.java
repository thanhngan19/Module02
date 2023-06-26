import java.util.*;

public class reverseNum {
    Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        stack.push(arr[1]);
        stack.push(arr[2]);
        System.out.println(stack);
        System.out.println("Mảng sau khi đảo ngược là : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return false;
        }
        return true;
    }


}