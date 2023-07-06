package CaseStudy1.service;

import CaseStudy1.model.Customer;
import CaseStudy1.reposity.CustomerReposity;
import CaseStudy1.reposity.ICustomerReposity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService{
    static Scanner scanner = new Scanner(System.in) ;
    static ICustomerReposity customerservice= new CustomerReposity();
    static LinkedList<Customer> customer= customerservice.findAll();
    @Override
    public void display() {
      for(Customer ch: customer){
          System.out.println(ch);
      }
    }

    @Override
    public void add() {
        System.out.println("Nhập vào họ tên: ");
        String newName= scanner.nextLine();
        String newDate= Date();
        String newGender= Gender();
        String CMND= CMND();
        String sdt = SDT();
        String email = Email();
        String lkh= LKH();
        System.out.println("Nhập vào địa chỉ: ");
        String dc= scanner.nextLine();
        Customer customer6= new Customer(customerservice.getSize()+1, newName, newDate, newGender, CMND, sdt, email, lkh, dc);
        customer.add(customer6);
        LinkedList<Customer> lk =customerservice.readFromFile(customer);
        for(Object chan: lk){
            System.out.println(chan);
        }
    }

    @Override
    public void fixInfor() {
        System.out.println("Nhập vào id customer muốn sửa : ");
        int idFixx = Integer.parseInt(scanner.nextLine());
        int choose;
        do {
            System.out.println("Nhập thông tin muốn sửa!!");
            System.out.println("1.Name");
            System.out.println("2. Ngày sinh");
            System.out.println("3.Giới tính");
            System.out.println("4.CMND");
            System.out.println("5.Số điẹn thoại");
            System.out.println("6.Email");
            System.out.println("7.Loại khách hàng");
            System.out.println("8.Địa chỉ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("input new name: ");
                    String newName = scanner.nextLine();
                    customer.get(idFixx).setName(newName);
                    LinkedList<Customer> customerID = customerservice.readFromFile(customer);
                    for (Customer ch : customerID) {
                        System.out.println(ch);
                    }
                    break;
                case 2:
                    System.out.println("Input new date!!");
                    String strDate1 = Date();
                    customer.get(idFixx).setDate(strDate1);
                    LinkedList<Customer> customerDate = customerservice.readFromFile(customer);
                    for (Customer ch : customerDate) {
                        System.out.println(ch);
                    }
                    break;
                case 3:
                    System.out.println("Input gender!!");
                    String gender = Gender();
                    customer.get(idFixx).setDate(gender);
                    LinkedList<Customer> customerGender = customerservice.readFromFile(customer);
                    for (Customer ch : customerGender) {
                        System.out.println(ch);
                    }
                    break;
                case 4:
                    System.out.println("CMND");
                    String cmnd = CMND();
                    customer.get(idFixx).setCMND(cmnd);
                    LinkedList<Customer> customercmnd = customerservice.readFromFile(customer);
                    for (Customer ch : customercmnd) {
                        System.out.println(ch);
                    }

                    break;
                case 5:
                    System.out.println("input phone!!!");
                    String newPhone = SDT();
                    customer.get(idFixx).setSDT(newPhone);
                    LinkedList<Customer> customerPhone = customerservice.readFromFile(customer);
                    for (Customer ch : customerPhone) {
                        System.out.println(ch);
                    }
                    break;
                case 6:
                    System.out.println("input email!!");
                    String email = Email();
                    customer.get(idFixx).setEmail(email);
                    LinkedList<Customer> customerEmail = customerservice.readFromFile(customer);
                    for (Customer ch : customerEmail) {
                        System.out.println(ch);
                    }
                    break;
                case 7:
                    System.out.println("Loại khách hàng!!");
                    String lkh = LKH();
                    customer.get(idFixx).setLKH(lkh);
                    LinkedList<Customer> customerlkh = customerservice.readFromFile(customer);
                    for (Customer ch : customerlkh) {
                        System.out.println(ch);
                    }
                    break;
                case 8:
                    System.out.println("vị trí : ");
                    String dc = scanner.nextLine();
                    customer.get(idFixx).setDC(dc);
                    LinkedList<Customer> customervitri = customerservice.readFromFile(customer);
                    for (Customer ch : customervitri) {
                        System.out.println(ch);
                    }
                    break;
            }

        } while (choose >= 1 && choose < 9);

    }
    public static boolean hopLe(int day, int month, int year) {
        int[] max = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        if (day > max[month] && month != 2) {
            return false;
        }
        if (month > 12) {
            return false;
        }
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (day <= 29) {
                    return true;
                } else {
                    System.out.println("Năm nhuận nên tháng 2 có 29 ngày !!");
                    return false;
                }
            } else {
                if (day <= 28) {
                    return true;
                } else {
                    System.out.println("Năm không nhuận nên tháng 2 chỉ có 28 ngày !!");
                    return false;
                }
            }
        } else {
            return true;
        }
    }
    public static String Date() {
        Date date1;
        String strDate1;
        while (true) {
            System.out.println("Nhap ngay: ");
            int day = Integer.parseInt(scanner.nextLine());
            int month;
            while (true) {
                System.out.println("Nhap tháng: ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 12) {
                    break;
                } else {
                    System.out.println("tháng k hợp lệ!!");
                }
            }
            int year;
            while (true) {
                System.out.println("Nhap năm: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year < 2023) {
                    break;
                } else {
                    System.out.println("tháng không hợp lệ!!");
                }
            }
            if (hopLe(day, month, year)) {
                date1 = new Date(day, month, year);
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                strDate1 = formatter.format(date1);
                System.out.println(strDate1);
                return strDate1;
            } else {
                System.out.println("ngày k hợp lệ");
            }

        }

    }
    public static String Gender() {
        String gender1;
        while(true){
            System.out.println("Nhập vào giới tính: ");
            gender1 = scanner.nextLine();

            if (gender1.equals("nam")|| gender1.equals("nữ")) {
                return gender1;

            } else {
                System.out.println("giới tính k hợp lệ !!");

            }
        }
    }
    public static String Email() {
        String email1;
        while (true) {
            System.out.println("Nhập vào email: ");
            email1 = scanner.nextLine();
            String mp = "^[a-zA-Z][a-zA-Z0-9]+@gmail.com";
            if (Pattern.matches(mp, email1)) {
                return email1;
            } else {
                System.out.println("email không hợp lệ !!");
            }
        }
    }
    public static String SDT() {
        String SDT1;
        while (true) {
            System.out.println("Nhập vào số điện thoại: ");
            SDT1 = scanner.nextLine();
            String mp = "^09\\d{8}$";
            if (Pattern.matches(mp, SDT1)) {
                return SDT1;
            } else {
                System.out.println("Số điện thoại không hợp lệ!");
            }
        }
    }
    public static String CMND() {
        String CMND;
        while (true) {
            System.out.println("Nhập vào CMND: ");
            CMND = scanner.nextLine();
            String mp = "^[0-9]{10}$";
            if (Pattern.matches(mp, CMND)) {
                return CMND;
            } else {
                System.out.println("CMDN k hợp lệ !!");
            }
        }
    }
    public static String LKH(){
        String [] LKH={"Diamond", "Platinium", "Gold", "Silver", "Member"};

       while(true){
           System.out.println("Nhập vào loại khách hàng : ");
           String lkh1= scanner.nextLine();
           for(int i=0; i<LKH.length; i++){
               if(lkh1.equals(LKH[i])){
                   return lkh1;
               }else{
                   System.out.println("Loại khách hàng không hợp lệ !!");
               }
           }

       }










    }

}
