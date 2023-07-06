package CaseStudy1.reposity;

import CaseStudy1.model.Employee;
import CaseStudy1.until.EmployeeReadFile;
import CaseStudy1.until.EmployeeWriteFile;

import java.util.ArrayList;

public class EmployeeReposity implements IEmployeeReposity {
    static ArrayList<Employee> employee = new ArrayList<Employee>();

    static int size;
    public ArrayList<Employee> findAll() {
        return  employee= EmployeeReadFile.ReadFile();
    }
    @Override
    public int getSize() {
        return employee.size();
    }
    @Override
    public ArrayList<Employee> writeFile(ArrayList<Employee>demo) {
        return EmployeeWriteFile.WriteFile(demo);
    }

}