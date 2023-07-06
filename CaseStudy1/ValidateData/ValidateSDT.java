package CaseStudy1.ValidateData;

import CaseStudy1.model.Employee;
import CaseStudy1.reposity.EmployeeReposity;
import CaseStudy1.reposity.IEmployeeReposity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateSDT {
    static Scanner scanner = new Scanner(System.in);

    public static String SDT(ArrayList<Employee> test) {

        String SDT1;
        while (true) {
            String mp = "^09\\d{8}$";
            System.out.println("Nhập vào số điện thoại: ");
            SDT1 = scanner.nextLine();
            ArrayList<String> count = new ArrayList<String>();
            for(Employee ch: test){
                if(ch.getSDT().equals(SDT1)){
                    count.add(SDT1);
                }
            }
            if(Pattern.matches(mp, SDT1) ){
                if(count.size()<=0){
                    return SDT1;
                }else{
                    System.out.println("sdt tồn tại !!");
                }
            }else{
                System.out.println("Số điện thoại không hợp lệ sai format");

            }

        }
    }
}
