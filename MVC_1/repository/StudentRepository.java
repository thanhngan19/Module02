package MVC_1.repository;

import MVC_1.model.Student;

public class StudentRepository implements IStudentRepository{
    static Student [] students= new Student[100];
    static int size;
    static {
        students[0] = new Student(0, "Nguyễn Văn A", 9.6);
        students[1] = new Student(1, "Nguyễn Văn B", 5.6);
        students[2] = new Student(2, "Nguyễn Văn C", 6.7);
        size = 3;
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int DownSize() {
        return size++;
    }
}
