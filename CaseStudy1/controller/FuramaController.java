package CaseStudy1.controller;
import CaseStudy1.Exception.NotFoundEmployeeException;
import CaseStudy1.service.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FuramaController {
    static Scanner sc= new Scanner(System.in);
    static IEmployeeService employeeservice = new EmployeeService();
    static ICustomerService customerservice = new CustomerService();
    static IFacilityService facility = new FacilityService();
    public static IBookingService booking = new BookingService();
    static IContactService contact = new ContactService();
    static IPromotionService promotion = new PromotionService();

    public void displayMenu(){
        boolean isTrue= true;
        int choose = 0;
        do {
            while(true){
            try{
            System.out.println("========== Menu ==========");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6,Exit");
           while(true){
               System.out.println("Select your choose : ");
               choose = Integer.parseInt(sc.nextLine());
               if(choose>6){
                   System.out.println("k có");
               }
               else{
                   break;
               }
           }
            switch (choose) {
                case 1:
                    int n;
                    do  {
                        System.out.println("1.Display list employees");
                        System.out.println("2.Add new employee");
                        System.out.println("3.Edit employee");
                        System.out.println("4.Delete employee");
                        System.out.println("5.Find employee");
                        System.out.println("6.return main menu");
                        n = Integer.parseInt(sc.nextLine());

                        switch  (n){
                            case 1:
                                employeeservice.display();
                                break;
                            case 2:
                                employeeservice.add();
                                break;
                            case 3:

                                   employeeservice.fixInfor();
                                   employeeservice.display();


                                break;
                            case 4:
                                employeeservice.DeleteEmployee();
                                employeeservice.display();
                                break;
                            case 5:
                                employeeservice.FindEmployee();
                        }
                    }while(n >= 1 && n <= 5);
                    break;
                case 2:
                    int m;
                    do  {
                        System.out.println("1.Display list customer");
                        System.out.println("2.Add new customer");
                        System.out.println("3.Edit customer");
                        System.out.println("4.return main menu");
                        m = Integer.parseInt(sc.nextLine());
                        switch  (m){
                            case 1:
                                customerservice.display();
                                break;
                            case 2:
                                customerservice.add();
                                break;
                            case 3:
                                customerservice.fixInfor();
                                customerservice.display();
                                break;


                        }
                    }while(m >= 1 && m <= 3);
                    break;
                case 3:
                    int l;
                    do  {
                        System.out.println("1.Display list facility");
                        System.out.println("2.Add new facility");
                        System.out.println("3.Display list facility maintenance");
                        System.out.println("4.return main menu");
                        l = Integer.parseInt(sc.nextLine());
                        switch  (l){
                            case 1:
                                facility.display();
                                break;
                            case 2:
                                facility.add();
                                facility.display();
                        }
                    }while(l >= 1 && l <= 3);
                    break;
                case 4:
                    int x;
                    do  {
                        System.out.println("1.Add new booking");
                        System.out.println("2.Display list booking");
                        System.out.println("3.Create new constracts");
                        System.out.println("4.Display list contracts");
                        System.out.println("5.Edit contracts");
                        System.out.println("6.return main menu");
                        x = Integer.parseInt(sc.nextLine());
                        switch  (x){
                            case 1:
                                booking.CreateBookings();
                                break;
                            case 2:
                                booking.display();
                                break;
                            case 3:
                                 try{
                                     contact.addNew();
                                 }catch(NoSuchElementException e){
                                 }catch(NullPointerException e){
                                     }
                                 break;

                            case 4:
                                contact.Display();
                                break;
                            case 5:
                                contact.fixInfo();
                                break;
                        }
                    }while(x >= 1 && x <= 5);
                    break;
                case 5:
                    int o;
                    do  {
                        System.out.println("1.Display list customers use service");
                        System.out.println("2.Display list customers get voucher");
                        System.out.println("3.Return main menu");
                        o = Integer.parseInt(sc.nextLine());
                        switch  (o){
                            case 1:
                                promotion.Display();
                                break;
                            case 2:
                                promotion.Voucher();
                                break;
                        }
                    }while(o >= 1 && o <= 2);

            }
            break;
            }catch(NumberFormatException e){
                System.out.println( "Wrong format number");
            } catch (NotFoundEmployeeException e) {
            }
            }
        } while (choose >= 1 && choose <=5);

    }
    }



