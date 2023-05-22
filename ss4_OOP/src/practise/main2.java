package practise;

public class main2 {
    public static void main(String[] args) {
        String name= null;
        System.out.println("Nguyễn Văn A".equals(name));
        Student student = new Student("Nguễn Văn A",9.6);
        System.out.println(student.display());
        Student student1 = new Student(1,"Nguễn Văn B",9.6);
        System.out.println(student1.display());
    }
}
