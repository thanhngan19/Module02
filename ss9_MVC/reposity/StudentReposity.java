package ss9_MVC.reposity;

import ss9_MVC.model.Student;

public class StudentReposity implements IStudentReposity{
    static Student[] students= new Student[100];
    static int size=0;
    static {
        students[0]= new Student(0,"Nguyễn Văn A", 9.8);
        students[1]= new Student(1,"Nguyễn Văn B", 9.8);
        students[2]= new Student(2,"Nguyễn Văn C", 9.8);
        students[3]= new Student(3,"Nguyễn Văn D", 9.8);
        students[4]= new Student(4,"Nguyễn Văn E", 9.8);
        students[5]= new Student(5,"Nguyễn Văn F", 9.8);
        int size=6;
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
    public String fixName(String newName,int i) {
        return students[i].setName(newName);

//        Student students[i] = student.setName(newName);


    }

    @Override
    public void fixScore(Double newScore, int i) {
        students[i].setScore(newScore);
    }


    @Override
    public void Delete(int idDe) {
        for (int i = 0; i < size-1; i++) {
            if (i == idDe) {
                int index_de = i;
                for (int j = index_de; j < size-1; j++) {
                    students[j] = students[j + 1];
                    System.out.println(students[j] + " ");
                }
                break;
            } else if (i != idDe) {
                System.out.println(students[i] + " ");
            }
        }
    }
}
