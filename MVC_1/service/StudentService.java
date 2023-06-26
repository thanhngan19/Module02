package MVC_1.service;

import MVC_1.controller.StudentController;
import MVC_1.model.Student;
import MVC_1.repository.IStudentRepository;
import MVC_1.repository.StudentRepository;

import java.util.Scanner;

public class  StudentService implements IStudentService {
    static IStudentRepository studentRepository= new StudentRepository();
    static Student [] students = studentRepository.findAll();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for(int i=0; i< studentRepository.getSize();i++){
            System.out.println(students[i]);
        }
    }

    @Override
    public void FixInfo() {
        System.out.println("Input id whose student u want to change information");
        int ifFix = Integer.parseInt(scanner.nextLine());
        System.out.println("which name or score");
        System.out.println("1. Name");
        System.out.println("2. Score");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Input New Name ");
                String newName = scanner.nextLine();
                students[ifFix].setName(newName);
                for (int i = 0; i < studentRepository.getSize(); i++) {
                    System.out.println(students[i]);
                }
            case 2:
                System.out.println("Input New Score");
                double newScore = Double.parseDouble(scanner.nextLine());
                students[ifFix].setScore(newScore);
                for (int i = 0; i < studentRepository.getSize(); i++) {
                    System.out.println(students[i]);
                }
        }
    }

    @Override
    public void Delete() {
        System.out.println("Input id whose student u want to delete in list");
        int idDe = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentRepository.getSize()-1; i++) {
            if (i == idDe) {
                int index_de = i;
                for (int j = index_de; j < studentRepository.getSize()-1; j++) {
                    students[j] = students[j + 1];
                    System.out.println(students[j] + " ");
                }
                break;
            } else if (i != idDe) {
                System.out.println(students[i] + " ");
            }
        }
    }

    @Override
    public void Add() {
        System.out.println("Input Name");
        String Name = scanner.nextLine();
        System.out.println("Input score");
        double score = Double.parseDouble(scanner.nextLine());
        students[studentRepository.getSize()]= new Student(studentRepository.getSize(), Name,score);
        for (int i=0; i<studentRepository.DownSize();i++){
            System.out.println(students[i]);
        }
    }
}
