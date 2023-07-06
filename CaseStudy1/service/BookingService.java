package CaseStudy1.service;

import CaseStudy1.model.*;
import CaseStudy1.reposity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

import static CaseStudy1.controller.FuramaController.booking;

public class BookingService implements IBookingService{
    static IBookingReposity getBookings= new BookingReposity();
   static  TreeSet<Booking> bookings= getBookings.findAll();
   static ICustomerReposity customerReposity = new CustomerReposity();
   static LinkedList<Customer> customer= customerReposity.findAll();
   static Scanner scanner = new Scanner(System.in);
    static IFacilityReposity facilityreposity= new FacilityReposity();
   static LinkedHashMap<count, House> house =facilityreposity.findAllHouse();
   static TreeSet<Booking> BookingMain = Access(bookings);
   public static TreeSet<Booking> Access(TreeSet<Booking> bookings){
       for(Booking ch: bookings){
           if(ch.equals(bookings)){
                 bookings.remove(ch);
                 bookings.remove(bookings);
           }
       }
       return bookings;
   }


    public void display(){
        for(Booking ch: BookingMain){
            System.out.println(ch);
        }
    }
    public static boolean hopLe(int day, int month, int year) {
        int[] max = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        if (day > max[month] && month != 2) {
            return false;
        }
        if (month > 12 || month<1) {
            System.out.println("tháng lớn hơn 0 và nhỏ hơn 12");
            return false;
        }
        if(year>2023){
            System.out.println("năm nhỏ hơn 2023");

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
        }
        else {
            return true;
        }
    }
    public static LocalDate Date() {
        Scanner scanner = new Scanner(System.in);
        LocalDate startDate  ;
        int day;
        int month;
        int year;
        String dateNew;
        while (true) {
            while(true){
                try{
                    dateNew = scanner.nextLine();
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd-MM-yyyy][d-M-yyyy]");
                    startDate = LocalDate.parse(dateNew, formatter1);
                    System.out.println(startDate);
                    LocalDate now= LocalDate.now();
                    System.out.println(now);
                    break;
                }catch(Exception e){
                    System.out.println("Sai format!!!");
                }
            }
            String[] strings = dateNew.split("-");
            day = Integer.parseInt(strings[0]);
            month = Integer.parseInt(strings[1]);
            year = Integer.parseInt(strings[2]);

            if (hopLe(day, month, year)) {
                return startDate;
            }
        }
    }
    public void CreateBookings (){
        System.out.println("Danh sách customer chọn mã khách hàng");
        for(Customer ch: customer){
            System.out.println(ch.getMkh()+","+ch.getName());
        }
        ArrayList<Integer> idCustomer = new ArrayList<Integer>();
        int mkh;
        while(true){
            try{
                System.out.println("Nhập vào mã khách hàng");
                mkh= Integer.parseInt(scanner.nextLine());
                for(Customer ch: customer ){
                    if(ch.getMkh()== mkh){
                        idCustomer.add(mkh);
                    }
                }
                if(idCustomer.size()>0){
                    break;
                }
                else{
                    System.out.println("Không tìm thấy idCustomer!!");
                }
            }catch(NumberFormatException e){
                System.out.println("Sai định dạng số!");
            }catch(ArithmeticException e){
                System.out.println(e.toString());
            }
        }
        System.out.println("Id customer là : "+ mkh);
        int select;
        do {
            System.out.println("1.vilaa");
            System.out.println("2.house");
            System.out.println("3.room");
            System.out.println("4.exit");
            System.out.println("Nhập vào lựa chọn: ");
            select = Integer.parseInt(scanner.nextLine());
            String mdv = null;
            switch (select) {
                case 1:
//                    Set<Villa> keySet = villa.keySet();
//                    for (Villa key : keySet) {
//                        System.out.println("số lần sử dụng"+key + " " + villa.get(key));
//                    }
                case 2:
                    Set<count> houseIn = house.keySet();
                    for (count key : houseIn) {
                        System.out.println(key.getCount() + " " + "số lần sử dụng: " + house.get(key));
                    }
                    ArrayList<String> list = new ArrayList<String>();
                    while (true) {
                        try {
                            System.out.println("Nhập vào mã dịch vụ");
                            mdv = scanner.nextLine();
                            Set<count> houseAc = house.keySet();
                            for (count c : houseAc) {
                                if (house.get(c).getName().equals(mdv)) {
                                    list.add(mdv);
                                }
                            }
                            if (list.size() > 0) {
                                break;
                            } else {
                                System.out.println("k tìm thấy mã dịch vụ, vui lòng nhập lại!!");
                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                        System.out.println("Nhập vào ngày bắt đầu !: ");
                        LocalDate startDate = Date();
                        System.out.println("Nhập vào ngày kêt thúc!!: ");
                        LocalDate endDate = Date();
                        Booking booking = new Booking(bookings.size() + 1, startDate, endDate, mkh, mdv);
                        bookings.add(booking);
                        TreeSet<Booking> bookingAdd = getBookings.readFromFile(bookings);
                        for (Booking ch : bookingAdd) {
                            System.out.println(ch);
                        }
                        Set<count> houseAdd = house.keySet();
                        for (count key : houseAdd) {
                            if (Objects.equals(house.get(key).getName(), mdv)) {
                                int i = key.getCount() + 1;
                                key.setCount(i);
                            }
                        }
                        LinkedHashMap<count, House> houseMain = facilityreposity.readFromFile(house);

//                case 3:
//                    Set<Room> roomIn = room.keySet();
//                    for (Room key : roomIn) {
//                        System.out.println("số lần sử dụng"+key + " " + room.get(key));
//                    }


                    }

        }
        while (select >= 1 && select <= 3) ;


    }
}

