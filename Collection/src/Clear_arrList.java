import java.util.ArrayList;

public class Clear_arrList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("java");
        arrList.add("python");
        arrList.add("PHP");
        arrList.add("C++");
        arrList.add("C#");
        arrList.add("java");
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.clear();
        System.out.println(arrList);
    }
}
