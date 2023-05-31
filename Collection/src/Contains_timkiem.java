import java.util.ArrayList;

public class Contains_timkiem {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("java");
        arrList.add("python");
        arrList.add("PHP");
        arrList.add("C++");
        arrList.add("C#");
        arrList.add("java");
        System.out.println(arrList.contains("PHP"));
    }
}
