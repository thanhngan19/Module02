package CaseStudy1.reposity;

import CaseStudy1.model.Customer;
import CaseStudy1.model.Employee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class CustomerReposity implements ICustomerReposity {

    static LinkedList<Customer> Customer = new LinkedList<>();
    static int size;
    static{
        Date date1 = new Date(19/10/2003);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate1 = formatter.format(date1);
        Date date2 = new Date(19/10/2003);
        String strDate2 = formatter.format(date2);
        Date date3 = new Date(19/10/2003);
        String strDate3 = formatter.format(date3);
        Date date4 = new Date(19/10/2003);
        String strDate4 = formatter.format(date4);
        Date date5 = new Date(19/10/2003);
        String strDate5 = formatter.format(date5);



        Customer customer1 = new Customer(1,"Nguyễn Văn A",strDate1, "nam", "039847 ", "087468","nguẽn@gmail.com","Member","Villa") ;
        Customer customer2 = new Customer(1,"Nguyễn Văn A",strDate1, "nam", "039847 ", "087468","nguẽn@gmail.com","Member","Villa") ;
        Customer customer3 = new Customer(1,"Nguyễn Văn A",strDate1, "nam", "039847 ", "087468","nguẽn@gmail.com","Member","Villa") ;
        Customer customer4 = new Customer(1,"Nguyễn Văn A",strDate1, "nam", "039847 ", "087468","nguẽn@gmail.com","Member","Villa") ;
        Customer customer5 = new Customer(1,"Nguyễn Văn A",strDate1, "nam", "039847 ", "087468","nguẽn@gmail.com","Member","Villa") ;


        Customer.add(customer1);
        Customer.add(customer2);
        Customer.add(customer3);
        Customer.add(customer4);
        Customer.add(customer5);
        size = Customer.size();
    }


    public LinkedList<Customer> findAll() {
        return Customer;
    }

    @Override
    public int getSize() {
        return size;
    }

}

