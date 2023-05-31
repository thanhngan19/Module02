import java.util.ArrayList;
import java.util.Iterator;

public class Flick_List {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
            arrList.add("java");
            arrList.add("python");
            arrList.add("PHP");
            arrList.add("C++");
            arrList.add("C#");
            arrList.add("java");
            // dyệt bằng interator
//        Iterator<String> itr=arrList.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        // duỷt bằng for each
        for (String obj : arrList){
            System.out.println(obj);
        }
        System.out.println("Mảng sau khi xoá là : ");
        arrList.remove("PHP");
        System.out.println(arrList);
    }
}
