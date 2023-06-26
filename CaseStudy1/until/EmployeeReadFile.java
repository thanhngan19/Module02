package CaseStudy1.until;

import CaseStudy1.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeReadFile {
    static ArrayList<Employee> Employee = new ArrayList<Employee>();
    public static ArrayList<Employee> ReadFile(String path){
        File file = new File(path);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line ="";
            while((line=bufferedReader.readLine())!=null){
                String [] strings = line.split(",");
                Employee employee = new Employee();
                employee.setMnv(Integer.parseInt(strings[0]));
                employee.setName(strings[1]);
                employee.setDate(strings[2]);
                employee.setGender(strings[3]);
                employee.setCMND(strings[4]);
                employee.setSDT(strings[5]);
                employee.setEmail(strings[6]);
                employee.setHv(strings[7]);
                employee.setVitri(strings[8]);
                employee.setSalary(Double.parseDouble(strings[9]));
                Employee.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Employee;
    }

}
