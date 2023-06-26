import java.util.EmptyStackException;
import java.util.LinkedList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class StackLinkedList<T> {
     private LinkedList<T> stack;

    public StackLinkedList() {
        stack  = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    private boolean isEmpty() {
       if(stack.size()==0){
           return true;
       }
       return false;
    }
   private int size(){
       return stack.size();

   }
   public static void stackOfString(){
        StackLinkedList<String>stack = new StackLinkedList<String>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Six");
        stack.push("Seven");
        stack.push("Eight");
        stack.push("Nine");
       System.out.println("size"+" "+ stack.size());
       while(!stack.isEmpty()){

           System.out.println(stack.pop());
       }
       System.out.println(stack.size());
   }
    public static void stackOfIntegers() {
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }



}
