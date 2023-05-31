package ss9_MVC.service;

import ss9_MVC.model.Student;
import ss9_MVC.reposity.IStudentReposity;
import ss9_MVC.reposity.StudentReposity;

import java.util.Scanner;



public class StudentService implements IStudentService {

    private  IStudentReposity iStudentReposity= new StudentReposity();

    static Scanner scanner= new Scanner(System.in);
    Student[] students = iStudentReposity.findAll();



    @Override
    public void display() {

        Student[] students = iStudentReposity.findAll();
        for (int i = 0; i < iStudentReposity.getSize(); i++) {
            System.out.printf("Thông tin sinh viên thứ %d:\n", i + 1);
            System.out.println(students[i]);
        }
    }

    @Override
    public void FixInfo() {
        System.out.println("Nhập id học sinh muốn sửa thông tin");
        int idFix=Integer.parseInt(scanner.nextLine());
        System.out.println("1. Sửa tên");
        System.out.println("2.Sửa lớp");
        int fix= Integer.parseInt(scanner.nextLine());
        switch (fix){
            case 1:

                System.out.println("Nhập tên muốn sửa");
                String newName= scanner.nextLine();
//                iStudentReposity.fixName(newName,idFix);
                iStudentReposity.fixName(newName,idFix);

                for (int i=0; i<iStudentReposity.getSize();i++){
                    System.out.println(students[i]);
                }
                break;
            case 2:
                System.out.println("Nhập điểm muốn sửa");
                String newScore= scanner.nextLine();
                iStudentReposity.fixName(newScore,idFix);
                for (int i=0; i<iStudentReposity.getSize();i++){
                    System.out.println(students[i]);
                }
                break;
        }
    }

    @Override
    public void DeInfo() {
        System.out.println("ID học sinh muốn xoá trong danh sách");
        int idDe= Integer.parseInt(scanner.nextLine());
       iStudentReposity.Delete(idDe);
    }
}
