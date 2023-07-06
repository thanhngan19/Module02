import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Class> classes= new TreeSet<Class>();
        Class clazz= new Class(1,"ngân");
        Class clazz2= new Class(1,"thảo");
        Class clazz3= new Class(2,"diệu");
        Class clazz4= new Class(3,"hiền");
        Class clazz5= new Class(4,"thảo");

        classes.add(clazz);
        classes.add(clazz2);
        classes.add(clazz3);
        classes.add(clazz4);
        classes.add(clazz5);
        for(Class clazzdemo : classes){
            System.out.println(clazzdemo);
        }
    }
}
