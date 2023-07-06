package CaseStudy1.ValidateData;

import CaseStudy1.Exception.NotFoundEmployeeException;
import CaseStudy1.model.Employee;
import CaseStudy1.reposity.EmployeeReposity;
import CaseStudy1.reposity.IEmployeeReposity;

import java.util.ArrayList;
import java.util.Scanner;



public class ValidateGetID {
    static Scanner scanner = new Scanner(System.in);

    public static Integer getId( ArrayList<Employee> test )throws NotFoundEmployeeException {
        int idFixx;
        int choose;

        ArrayList<Integer> count;
        idFixx = Integer.parseInt(scanner.nextLine());
        count = new ArrayList<Integer>();
        for (Employee ch : test) {
            if ((ch.getMnv()) == idFixx) {
                count.add(idFixx);
            }
        }
        if (count.size() > 0) {
            System.out.println("id bạn cần tìm là : "+idFixx);
        } else {
            throw new NotFoundEmployeeException("Not found id Student !!");
        }
        return idFixx;
    }
}
