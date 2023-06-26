import java.util.LinkedList;

public class demo {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int new1 = stack.removeLast();
        System.out.println(new1);
        System.out.println(stack);
    }
}
