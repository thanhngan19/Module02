package practise.main.Static;

public class main2 {
    public static void main(String[] args) {
        Student student = new Student(1,"Nguyễn Văn A");
        Student student2 = new Student(1,"Nguyễn Văn B");
        student.count++;
        ++student2.count;
        Student.count++;
//count =1
        System.out.println(student.count); //?  4// dùng chung vùng nhớ
        System.out.println(Student.count); //? 4
//        System.out.println(Math.sqrt(4));
        methodStatic();
    }
    public static void methodStatic() {

    }

    public void methodNonStatic() {
        methodStatic();
    }//static với non static
}
