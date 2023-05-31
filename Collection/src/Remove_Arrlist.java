import java.util.ArrayList;

public class Remove_Arrlist {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("java");
        arrList.add("python");
        arrList.add("PHP");
        arrList.add("C++");
        arrList.add("C#");
        arrList.add("java");
        arrList.remove(2);
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.remove("java");
        System.out.println(arrList.size());
    }
}
