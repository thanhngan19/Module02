import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queuepeek {
    public static void main(String[] args) {
        Queue<Integer> peek = new LinkedList<Integer>();
        peek.add(1);
        peek.add(2);
        peek.add(3);
        peek.add(4);
        peek.add(5);
        peek.remove(1);
        while(!peek.isEmpty()) {
            Iterator<Integer> iterator = peek.iterator();
            while (iterator.hasNext()) {
                Integer demo = iterator.next();
                if (demo.equals(2)) {
                    iterator.remove();
                }
            }

        }
        System.out.println(peek);
    }
}
