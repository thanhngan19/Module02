import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    static Scanner scanner = new Scanner(System.in);
    static Student []student1 = new Student[100];
    static int size=0;
    static {
        student1[0]= new Student(0,"Nguyễn Văn A", "9A");
        student1[1]= new Student(1,"Nguyễn Văn B", "9A");
        student1[2]= new Student(2,"Nguyễn Văn C", "9A");
        student1[3]= new Student(3,"Nguyễn Văn D", "10D2");
        student1[4]= new Student(4,"Nguyễn Văn E", "9A");
        student1[5]= new Student(5,"Nguyễn Văn F", "8A");
        student1[6]= new Student(6,"Nguyễn Văn G", "11A");
        student1[7]= new Student(7,"Nguyễn Văn H", "10A");
        student1[8]= new Student(8,"Nguyễn Văn G", "7A");
        student1[9]= new Student(9,"Nguyễn Văn E", "6A");
        size= 10;
    }

//    public Main(int id, String name, String classes) {
//        super(id, name, classes);
//    }

    public static void deleStudent() {
        System.out.println("Nhập id của học sinh mà bạn muốn xoá: ");
        int idDele = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size-1; i++) {
            if (i == idDele) {
                int index_de = i;
                for (int j = index_de; j < size-1; j++) {
                    student1[j] = student1[j + 1];
                    System.out.println(student1[j] + " ");
                }
                break;
            } else if (i != idDele) {
                System.out.println(student1[i] + " ");
            }
        }
    }
    public static void addStudent(){
//        System.out.println("Nhập số học sinh muốn thm vào danh sách");
//        int n = Integer.parseInt(scanner.nextLine());
//        for(int i=1; i<=n;i++){
//            System.out.println("Nhập vào tên học sinh");
//            student1[9+i].getName()=scanner.next();
//            System.out.println("Nhập vào lớp");
//            student1[9+i].getClasses()=scanner.next();
//            student1[9+i]= new Student(9+i,student1[9+i].getName(), student1.getClass());
//        }
        System.out.println("Nhập vào tên học sinh");
        String  name =scanner.nextLine();
        System.out.println("Nhập vào lớp");
        String class1 = scanner.nextLine();
        student1[10]= new Student(10, name, class1);
        for (int i =0 ; i<size+1; i++){
            System.out.println(student1[i]);
        }
    }
    public static void fixInfo(){
        System.out.println("Chọn id của học sinh muốn sửa: ");
        int fixId = Integer.parseInt(scanner.nextLine());
        System.out.println("1. Sửa tên");
        System.out.println("2. Sửa lớp");
        int fix= Integer.parseInt(scanner.nextLine());
        switch (fix){
            case 1:
                System.out.println("Nhập tên bạn muốn sửa: ");
                String newName= scanner.nextLine();
                student1[fixId].setName(newName);
                for(int i=0; i<size;i++){
                    System.out.println(student1[i]);
                }
                break;
            case 2:
                System.out.println("Nhập lớp bạn muoons sửa");
                String newClass = scanner.nextLine();
                student1[fixId].setClasses(newClass);
                for(int i=0; i<size;i++){
                    System.out.println(student1[i]);
                }
                break;
        }

    }

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("menu");
            System.out.println("1. Xem danh sách ");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4.Thêm");
            System.out.println("5 Thoát");
            System.out.println("Nhập vào chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("xem danh sách ");
                    for(int i=0; i<size;i++){
                        System.out.println(student1[i]);
                    }
                    break;
                case 2:
                    System.out.println("Sửa thông tin ");
                    fixInfo();
                case 3:
                    System.out.println("Xoá phần tử trong danh sách ");
                   deleStudent();
                   break;
                case 4:
                    System.out.println("Thêm học sinh vào danh sách");
                    addStudent();
                    break;

            }
        }while(choose>=1 && choose <=4);// dk vòng lặp tiếp diễn
    }
}
