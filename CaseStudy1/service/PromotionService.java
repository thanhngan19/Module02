package CaseStudy1.service;

import CaseStudy1.model.Booking;
import CaseStudy1.reposity.BookingReposity;
import CaseStudy1.reposity.CustomerReposity;
import CaseStudy1.reposity.IBookingReposity;
import CaseStudy1.reposity.ICustomerReposity;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionService implements IPromotionService{
    static IBookingReposity bookings = new BookingReposity();
    static ICustomerReposity customer= new CustomerReposity();
 static TreeSet<Booking> getBookingList= bookings.findAll();
 static Scanner sc = new Scanner(System.in);
 public void Display(){
     int year;
     while(true){
         try{
             System.out.println("Nhập năm muốn xem: ");
             year= Integer.parseInt(sc.nextLine());
             break;
         }catch(NumberFormatException e){
             System.out.println("Sai định dạng số !");
         }
     }
     System.out.println("Danh sách customer theo năm !!!");
     for(Booking ch: getBookingList){
         String line = String.valueOf(ch.getStartDate());
         String [] strings = line.split("-");
         int yearFind= Integer.parseInt(strings[0]);
         if(yearFind== year ){
             System.out.println(ch);
         }
     }
 }
 public void Voucher(){
     int a10;
     int a20;
     int a50;
     while(true){
      try{
          int amonut = customer.getSize();
          System.out.println("Nhập vào số lượng voucher 10%");
           a10= Integer.parseInt(sc.nextLine());
          System.out.println("Nhập vào số lượng voucher 20%");
           a20= Integer.parseInt(sc.nextLine());
          System.out.println("Nhập vào số lượng voucher 50%");
           a50= Integer.parseInt(sc.nextLine());
          int sum = a10+a20+a50;
          if(sum<amonut){
              break;
          }else{
              System.out.println("Sai số lượng vocher");
          }
      }catch(NumberFormatException e){
          System.out.println("sai format số !!");
      }
     }
     Stack<Booking> hehe= new Stack<>();
     for(Booking ch: getBookingList){
         hehe.push(ch);
     }
     for(Booking ch: hehe){
       for(int i=1; i<=a10;i++){
           System.out.println("vouvher 10% !!");
           System.out.println(ch);
       }
       for(int i=1; i<=a20;i++){
           System.out.println("vouvher 20% !!");
           System.out.println(ch);
       }
     }
 }
}
