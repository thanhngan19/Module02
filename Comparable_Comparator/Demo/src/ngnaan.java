import java.util.ArrayList;
import java.util.Scanner;

public class ngnaan {
    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        ArrayList<Student> student = new ArrayList<>();
        Student student0 = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");
        student.add(student0);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        boolean isRight = true;
        int idCus = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập vào tuổi khách hàng");
                idCus = Integer.parseInt(scanner.nextLine());
                for (Student ch : student) {
                    if (ch.getAge() == idCus) {

                        demo.add(idCus);
                    }

                }
                if (demo.size() > 0) {
                    break;
                } else {
                    System.out.println("k tìm thấy id!!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số!");
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println(idCus);
    }
}
