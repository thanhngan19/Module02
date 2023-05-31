import java.util.ArrayList;

public class IndexOf {
    //vị trí xuất hiện dầu tiên
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("java");
        arrList.add("python");
        arrList.add("PHP");
        arrList.add("C++");
        arrList.add("C#");
        arrList.add("java");
        System.out.println(arrList.indexOf("java"));
        System.out.println(arrList.lastIndexOf("java"));
    }
}// toArray(): chuyển list thành mảng
