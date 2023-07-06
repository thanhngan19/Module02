package CaseStudy1.reposity;

import CaseStudy1.model.Customer;
import CaseStudy1.model.Employee;
import CaseStudy1.until.CustomerReadFile;
import CaseStudy1.until.CustomerWriteFile;
import CaseStudy1.until.EmployeeReadFile;
import CaseStudy1.until.EmployeeWriteFile;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class CustomerReposity implements ICustomerReposity {

    static LinkedList<Customer> Customer = new LinkedList<>();
    static int size;
    public LinkedList<Customer> findAll() {
        return Customer=CustomerReadFile.ReadFile();
    }
    public LinkedList<Customer> readFromFile(LinkedList<Customer>demo1) {
        return CustomerWriteFile.WriteFile(demo1);
    }
    @Override
    public int getSize() {
        return Customer.size();
    }

}

