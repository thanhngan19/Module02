import java.util.ArrayList;

public class Get_Set_ArrList {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("ngaan");
        arr.add("phuong");
        arr.add("tuyen");
        arr.add("else");
        arr.add("ânnaa");
        System.out.println(arr.get(3));
        arr.set(3,"mỳ");// set gái trị
        System.out.println(arr);

    }
}
