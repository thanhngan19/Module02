import java.util.ArrayList;

public class ArrList_Doi_Tuong {
    public static void main(String[] args) {
        Student student0 = new Student(0,"Nguyễn Văn A", "9A");
        Student student1 = new Student(1,"Nguyễn Văn A", "9A");
        Student student2 = new Student(2,"Nguyễn Văn A", "9A");
        Student student3 = new Student(3,"Nguyễn Văn A", "9A");
        Student student4 = new Student(4,"Nguyễn Văn A", "9A");
        ArrayList<Student> students= new ArrayList<Student>();
        students.add(student0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.get(2).setName("Ngân");

        for (Student oo : students){
            System.out.println(oo);
        }
    }
}
