package CaseStudy1.until;

import CaseStudy1.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class EmployeeReadFile {
    static ArrayList<Employee> Employee = new ArrayList<>();
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Employee.csv";
    public static ArrayList<Employee> ReadFile(){
        File file = new File(path);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line=bufferedReader.readLine())!=null){
                if (!line.isEmpty()){
                    String [] strings = line.split(",");
                    Employee employee = new Employee();
                    employee.setMnv(Integer.parseInt(strings[0]));
                    employee.setName(strings[1]);
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]");
                    LocalDate localDate = LocalDate.parse(strings[2],formatter1);
                    employee.setDate(localDate);
                    employee.setGender(strings[3]);
                    employee.setCMND(strings[4]);
                    employee.setSDT(strings[5]);
                    employee.setEmail(strings[6]);
                    employee.setHv(strings[7]);
                    employee.setVitri(strings[8]);
                    employee.setSalary(Double.parseDouble(strings[9]));
                    Employee.add(employee);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch(DateTimeParseException e){
            System.out.println("Date can't be parsed");
        }
        return Employee;
    }
}