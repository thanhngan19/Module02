package CaseStudy1.service;

import CaseStudy1.model.House;
import CaseStudy1.model.Room;
import CaseStudy1.model.Villa;
import CaseStudy1.reposity.FacilityReposity;
import CaseStudy1.reposity.IFacilityReposity;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService{
    static Scanner scanner = new Scanner(System.in);
    static IFacilityReposity facilityreposity= new FacilityReposity();
    static LinkedHashMap<Villa, Integer> VL=facilityreposity.findAllVilla();
    static LinkedHashMap<House, Integer> H=facilityreposity.findAllHouse();
    static LinkedHashMap<Room, Integer> ROOM=facilityreposity.findAllRoom();

    @Override
    public void display() {
        Set<Villa> keySet = VL.keySet();
        for (Villa key : keySet) {
            System.out.println(key + " " + VL.get(key));
        }
        Set<Room> roomIn= ROOM.keySet();
        for (Room room : roomIn){
            System.out.println(room+ " "+ ROOM.get(room));
        }
        Set<House> houseIn = H.keySet();
        for (House house : houseIn){
            System.out.println(house+" "+H.get(house));
        }
    }

    @Override
    public void add() {

        int choose;
        do {
            System.out.println("chọn facility muốn thêm vào !!");
            System.out.println("1.House");
            System.out.println("2.Villa");
            System.out.println("3.Room");
            System.out.println("Nhập lựa chọn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("thêm mới một House!!");
                    double area = Input1();
                    int total = Input2();
                    int maxPeople = Input3();
                    String kthue = Input4();
                    System.out.println("Nhập vào tiêu chuẩn phòng: ");
                    String tcp= scanner.nextLine();
                    System.out.println("Nhập vào sô tầng : ");
                    int soTang = Integer.parseInt(scanner.nextLine());
                    House newHouse = new House("House",area, total,maxPeople, kthue, tcp,soTang );
                    H.put(newHouse, 2);
                case 2:
                    System.out.println("thêm mới một Villa!!");
                    double area1 = Input1();
                    int total1 = Input2();
                    int maxPeople1 = Input3();
                    String kthue1 = Input4();
                    System.out.println("Nhập vào tiêu chuẩn phòng: ");
                    String tcp1= scanner.nextLine();
                    System.out.println("Nhập vào diẹn tích hồ bơi: ");
                    double DT = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập vào sô tầng : ");
                    int soTang1 = Integer.parseInt(scanner.nextLine());
                    Villa newVilla = new Villa("Villa",area1, total1, maxPeople1,kthue1,tcp1,DT,soTang1);
                    VL.put(newVilla,2);
                case 3:
                    System.out.println("thêm mới một Room!!");
                    double area2 = Input1();
                    int total2 = Input2();
                    int maxPeople2 = Input3();
                    String kthue2 = Input4();
                    System.out.println("Nhập vào dịch vụ đi kèm");
                    String link = scanner.nextLine();
                    Room newRoom = new Room("Room", area2, total2,maxPeople2,kthue2,link);
                    ROOM.put(newRoom,3);
            }

        } while (choose >= 1 && choose < 4);
    }
    public static double  Input1(){
        System.out.println("Nhập vào diện tích sử dụng: ");
        double area= Double.parseDouble(scanner.nextLine());
        return area;
    }
    public static int Input2(){
        System.out.println("Nhập vào chi phí thuê: ");
        int total = Integer.parseInt(scanner.nextLine());
        return total;
    }
    public static int Input3(){

        System.out.println("Nhập vào tổng số nngười sử dụng : ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        return maxPeople;
    }
    public static String Input4(){
        System.out.println("KIểu thuê: ");
        String kthue= scanner.nextLine();
        return  kthue;
    }
}
