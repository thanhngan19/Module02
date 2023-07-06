package CaseStudy1.reposity;

import CaseStudy1.model.Customer;
import CaseStudy1.model.Employee;

import java.util.ArrayList;
import java.util.LinkedList;

public interface ICustomerReposity {

    LinkedList<Customer> findAll();
    int getSize();
    LinkedList<Customer> readFromFile(LinkedList<Customer>demo1);
}
