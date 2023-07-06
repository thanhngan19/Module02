package CaseStudy1.service;

import CaseStudy1.Exception.NotFoundEmployeeException;

public interface IEmployeeService {
    void display();
    void add();
    void fixInfor() throws NotFoundEmployeeException;
    void DeleteEmployee();
    void FindEmployee();


}