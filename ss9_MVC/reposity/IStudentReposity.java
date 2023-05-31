package ss9_MVC.reposity;

import ss9_MVC.model.Student;

public interface IStudentReposity {
    Student[] findAll();
    public int getSize();
    String fixName(String newName, int i);
    void fixScore(Double newScore,int i);
    void Delete(int idDe);
}
