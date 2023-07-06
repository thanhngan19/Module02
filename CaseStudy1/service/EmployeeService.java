package CaseStudy1.service;

import CaseStudy1.Exception.NotFoundEmployeeException;
import CaseStudy1.ValidateData.ValidateDate;
import CaseStudy1.ValidateData.ValidateEmail;
import CaseStudy1.ValidateData.ValidateGetID;
import CaseStudy1.ValidateData.ValidateSDT;
import CaseStudy1.model.Employee;
import CaseStudy1.reposity.EmployeeReposity;
import CaseStudy1.reposity.IEmployeeReposity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.regex.Pattern;
//import Exception.NotFoundEmployeeException;



public class EmployeeService implements IEmployeeService {

    static Scanner scanner = new Scanner(System.in);
    static IEmployeeReposity employeereposity = new EmployeeReposity();
    static ArrayList<Employee> employee = employeereposity.findAll();

    @Override
    public void display() {
        for (Employee ch : employee) {
            System.out.println(ch);
        }
    }
    @Override
    public void add() {
        int n;
        while (true) {
            try {
                System.out.println("Nhập vào số lượng employee muốn thêm vào file: ");
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai định dạng format số !!!");
            }
        }
        int count = 0;
        do {
            System.out.println("Họ tên");
            String nameIn = scanner.nextLine();
            String gender1 = Gender();
            LocalDate strDate1 = ValidateDate.Date();
            String CMND = CMND();
            String SDT1 = ValidateSDT.SDT(employee);
            String email1 = ValidateEmail.Email();
            String hv = TD();
            String VT = VT();
            System.out.println("Nhập vào lương: ");
            double salarynew = Double.parseDouble(scanner.nextLine());
            Employee employeenew = new Employee((employee.get(employeereposity.getSize() - 1).getMnv()) + 1, nameIn, strDate1, gender1, CMND, SDT1, email1, VT, hv, salarynew);
            employee.add(employeenew);
            ArrayList<Employee> employeeadd = employeereposity.writeFile(employee);
            for (Employee ch : employeeadd) {
                System.out.println(ch);
            }
            count++;
        } while (count < n);
    }
    @Override
    public void fixInfor()  {
        int choose;
        int idFixx;
        while(true) {
            try {
                System.out.println("Input id of employee which u want to edit");
                idFixx= ValidateGetID.getId(employee);
                break;
            } catch (NotFoundEmployeeException e) {
                System.out.println("Not found id which you want to find !! Input once again");
            }
        }
        do {
            System.out.println("Input infor which u need to fix!!");
            System.out.println("1.Name");
            System.out.println("2. Date of birth");
            System.out.println("3.Gender");
            System.out.println("4.CMND");
            System.out.println("5.Phone number");
            System.out.println("6.Email");
            System.out.println("7.Education level");
            System.out.println("8.Vị trí");
            System.out.println("9.Salary");
            System.out.println("10.Exit");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("input new name: ");
                    String newName = scanner.nextLine();
                    ArrayList<Employee> employees = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        if (ch.getMnv() == idFixx) {
                            ch.setName(newName);
                            employees = employeereposity.writeFile(employee);
                        }
                    }
                    System.out.println("List sau khi sửa");
                    for (Employee ch : employees) {
                        System.out.println(ch);
                    }
                }
                case 2 -> {
                    System.out.println("Input new date!!");
                    LocalDate strDate12 = ValidateDate.Date();
                    ArrayList<Employee> employeedate = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        ch.setDate(strDate12);
                        employeedate = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeedate) {
                        System.out.println(ch);
                    }
                }
                case 3 -> {
                    System.out.println("Input gender!!");
                    String gender = Gender();
                    ArrayList<Employee> employeegender = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        ch.setGender(gender);
                        employeegender = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeegender) {
                        System.out.println(ch);
                    }
                }
                case 4 -> {
                    System.out.println("CMND");
                    String cmnd = CMND();
                    ArrayList<Employee> employeecmnd = new ArrayList<>();
                    for (Employee ch : employee) {
                        ch.setCMND(cmnd);
                        employeecmnd = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeecmnd) {
                        System.out.println(ch);
                    }
                }
                case 5 -> {
                    System.out.println("input phone!!!");
                    String newPhone = ValidateSDT.SDT(employee);
                    ArrayList<Employee> employeephone = new ArrayList<>();
                    for (Employee ch : employee) {
                        ch.setSDT(newPhone);
                        employeephone = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeephone) {
                        System.out.println(ch);
                    }
                }
                case 6 -> {
                    System.out.println("input email!!");
                    String email = ValidateEmail.Email();
                    ArrayList<Employee> employeeemail = new ArrayList<>();
                    for (Employee ch : employee) {
                        ch.setEmail(email);
                        employeeemail = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeeemail) {
                        System.out.println(ch);
                    }
                }
                case 7 -> {
                    System.out.println("trình độ!!");
                    String td = TD();
                    ArrayList<Employee> employeetd = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        ch.setHv(td);
                        employeetd = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeetd) {
                        System.out.println(ch);
                    }
                }
                case 8 -> {
                    System.out.println("vị trí !!");
                    String vt = VT();
                    ArrayList<Employee> employeevt = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        ch.setVitri(vt);
                        employeevt = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeevt) {
                        System.out.println(ch);
                    }
                }
                case 9 -> {
                    System.out.println("Nhập lương : ");
                    String salary = scanner.nextLine();
                    ArrayList<Employee> employeesalary = new ArrayList<Employee>();
                    for (Employee ch : employee) {
                        ch.setName(salary);
                        employeesalary = employeereposity.writeFile(employee);
                    }
                    for (Employee ch : employeesalary) {
                        System.out.println(ch);
                    }
                }
                case 10 -> System.out.println("Danh sách sửa !!");
            }

        } while (choose >= 1 && choose < 10);

    }

    @Override
    public void DeleteEmployee() {
        int idDelete;
        while(true){
        try {
            System.out.println("Input id which you want to delete: ");
            idDelete = ValidateGetID.getId(employee);
            break;
        } catch (NotFoundEmployeeException e) {
            System.out.println("Not found id which you want to find !! Input once again");
        }
        }

        employee.remove(idDelete - 1);
        ArrayList<Employee> Deleted = employeereposity.writeFile(employee);
    }

    @Override
    public void FindEmployee() {
        int idFind;
        while(true){
            try {
                System.out.println("Input id which you want to find: ");
                idFind = ValidateGetID.getId(employee);
                break;
            } catch (NotFoundEmployeeException e) {
                System.out.println("Not found id which you want to find !! Input once again");
            }
        }
        for (Employee ch : employee) {
            if (ch.getMnv() == idFind) {
                System.out.println("employee là : " + ch);
            }
        }
    }


    public static String CMND() {
        String CMND;
        while (true) {
            System.out.println("Nhập vào CMND: ");
            CMND = scanner.nextLine();
            String mp = "^[0-9]{9,10}$";
            if (Pattern.matches(mp, CMND)) {
                return CMND;
            } else {
                System.out.println("CMDN k hợp lệ !!");
            }
        }
    }





    public static String TD() {
        String hv1 = "Trung cấp";
        String hv2 = "Cao đẳng";
        String hv3 = "Đại học";
        String hv4 = "Sau đại học";
        String hv;
        while (true) {
            System.out.println("Nhập vào trình độ: ");
            hv = scanner.nextLine();
            if (hv.equals(hv1) || hv.equals(hv2) || hv.equals(hv3) || hv.equals(hv4)) {
                return hv;
            } else {
                System.out.println("Thông tin không hợp lệ");
            }
        }
    }

    public static String VT() {
        String VT0 = "Lễ tân";
        String VT1 = "Phục vụ";
        String VT2 = "Chuyên viên";
        String VT3 = "Giám Sát";
        String VT4 = "Quản lý";
        String VT5 = "Giám đốc";
        String VTO;
        String VT;
        while (true) {
            System.out.println("Nhập vào vị trí: ");
            VT = scanner.nextLine();
            if (VT.equals(VT0) || VT.equals(VT1) || VT.equals(VT2) || VT.equals(VT3) || VT.equals(VT4) || VT.equals(VT5)) {
                return VT;
            } else {
                System.out.println("thông tin không hợp lệ");
            }
        }
    }


    public static String Gender() {
        String gender1;
        while (true) {
            System.out.println("Nhập vào giới tính: ");
            gender1 = scanner.nextLine();

            if (gender1.equals("nam") || gender1.equals("nữ")) {
                return gender1;

            } else {
                System.out.println("giới tính k hợp lệ !!");

            }
        }
    }
}



