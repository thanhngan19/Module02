import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> newStudent= new ArrayList<Student>();
        newStudent= StudentReadFile.ReadFile();
        for(Student ch: newStudent){
            System.out.println(ch);
        }
    }
//    public void addNew (){
//        int n;
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("số nhân vien muốn thêm vào file: ");
//             n = Integer.parseInt(sc.nextLine());
//        }catch(NumberFormatException e){
//            for(int i=1; i<=n;i++){
//                System.out.println("Name:");
//                String name = sc.nextLine();
//                System.out.println("birthday: ");
//
//            }
//        }

    }


