import java.util.ArrayList;

public class Add_Remove_Retain {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("java");
        arrList.add("python");
        arrList.add("PHP");
        arrList.add("C++");
        arrList.add("C#");
        arrList.add("java");

        ArrayList<String>  arrayList1 = new ArrayList<String>();
        arrayList1.addAll(arrList);
//        System.out.println(arrayList1);// in theo dạng mảng
        showList(arrayList1);
//
        ArrayList<String>  arrayList2 = new ArrayList<String>();
        arrayList2.add("python");
        arrayList2.add("java");
        arrayList1.retainAll(arrayList2);
        System.out.println("xoá phần tử arraylist2 khỏi khỏi arlisst1");
        showList(arrayList1);
        //
        System.out.println("removeAll");
        arrList.removeAll(arrayList2);
        showList(arrList);

    }
    public static void showList(ArrayList<String> arrList){
        for(String obj : arrList){
            System.out.println(obj);
        }
    }
}
