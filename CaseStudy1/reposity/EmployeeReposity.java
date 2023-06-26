package CaseStudy1.reposity;

import CaseStudy1.model.Employee;
import CaseStudy1.until.EmployeeReadFile;
import CaseStudy1.until.EmployeeWriteFile;

import java.util.ArrayList;

public class EmployeeReposity implements IEmployeeReposity {
    static String path= "CaseStudy1/data/Employee.csv";
    static int size;
    public ArrayList<Employee> findAll() {
        return  EmployeeReadFile.ReadFile(path);
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public ArrayList<Employee> readFromFile(ArrayList<Employee>demo, String path) {
        return EmployeeWriteFile.WriteFile(demo,path);
    }

}
