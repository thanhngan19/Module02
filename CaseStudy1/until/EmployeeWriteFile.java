package CaseStudy1.until;

import CaseStudy1.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EmployeeWriteFile {
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Employee.csv";
    public static ArrayList<Employee>WriteFile(ArrayList<Employee> employees){
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        File file = new File(path);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            for(Employee ch:employees){
                buff.write(ch.getMnv()+","+ch.getName()+","+formatter1.format(ch.getDate())+","+ch.getGender()+","+ch.getCMND()+","+ch.getSDT()+","+ch.getEmail()+","+ch.getHv()+","+ch.getVitri()+","+ch.getSalary());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
