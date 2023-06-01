package MVC_1.repository;

import MVC_1.model.Student;

public interface IStudentRepository {
   Student [] findAll();
   int getSize();
   int DownSize();
}
