import java.util.HashSet;
import java.util.Set;

public class Flick_List_HashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("java");
        hashSet.add("python");
        hashSet.add("php");
        hashSet.add("c++");
        hashSet.add("c##");
        hashSet.add("java");
        System.out.println(hashSet);
    }
}
