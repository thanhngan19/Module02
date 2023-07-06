package CaseStudy1.service;

import CaseStudy1.model.House;
import CaseStudy1.model.Room;
import CaseStudy1.model.Villa;
import CaseStudy1.model.count;
import CaseStudy1.reposity.FacilityReposity;
import CaseStudy1.reposity.IFacilityReposity;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

//import static CaseStudy1.reposity.FacilityReposity.villa;

public class FacilityService implements IFacilityService{
    static Scanner scanner = new Scanner(System.in);
    static IFacilityReposity facilityreposity= new FacilityReposity();
    static LinkedHashMap<Villa, Integer> villa=facilityreposity.findAllVilla();
    static LinkedHashMap<count,House> house=facilityreposity.findAllHouse();
    static LinkedHashMap<Room, Integer> room=facilityreposity.findAllRoom();
    private static final String REGEX_STRING ="^[A-Z][a-zA-Z]$";

    @Override
    public void display() {
        int select;
        do {
            System.out.println("1.vilaa");
            System.out.println("2.house");
            System.out.println("3.room");
            System.out.println("4.exit");
            System.out.println("Nhập vào lựa chọn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    Set<Villa> keySet = villa.keySet();
                    for (Villa key : keySet) {
                        System.out.println("số lần sử dụng"+key + " " + villa.get(key));
                    }
                case 2:
                    Set<count> houseIn = house.keySet();
                    for (count key : houseIn) {
                        System.out.println("count: "+ key.getCount()+" "+house.get(key));
                    }
                case 3:
                    Set<Room> roomIn = room.keySet();
                    for (Room key : roomIn) {
                        System.out.println("số lần sử dụng"+key + " " + room.get(key));
                    }
            }

        } while (select >= 1 && select<=3);
    }

    @Override
    public void add() {

        int choose;
        do {
            System.out.println("chọn facility muốn thêm vào !!");
            System.out.println("1.AddNewHouse");
            System.out.println("2.AddNewVilla");
            System.out.println("3.AddNewRoom");
            System.out.println("4.Exit");
            System.out.println("Nhập lựa chọn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("thêm mới một House!!");
                    String name = Input0();
                    double area = Input1();
                    int total = Input2();
                    int maxPeople = Input3();
                    System.out.println("NHập vào kiểu thuê");
                    String kthue = Input4();
                    System.out.println("Nhập vào tiêu chuẩn phòng: ");
                    String tcp= Input4();
                    int soTang = Input5();
                    int demo =0;
                    count so = new count(demo);
                    House newHouse = new House(name,area, total,maxPeople, kthue, tcp,soTang);
                    house.put(so,newHouse);
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
                    villa.put(newVilla,2);
                case 3:
                    System.out.println("thêm mới một Room!!");
                    double area2 = Input1();
                    int total2 = Input2();
                    int maxPeople2 = Input3();
                    String kthue2 = Input4();
                    System.out.println("Nhập vào dịch vụ đi kèm");
                    String link = scanner.nextLine();
                    Room newRoom = new Room("Room", area2, total2,maxPeople2,kthue2,link);
                    room.put(newRoom,3);
            }

        } while (choose >= 1 && choose < 4);
    }
    public static String Input0()

    {
        String pattern = "^SVHO[0-9]$";
        String name;
        while (true) {
            System.out.println("Nhập vào tên:  ");
            name = scanner.nextLine();
            if (Pattern.matches(pattern, name)) {
                break;
            } else {
                System.out.println("sai!!");
            }
        }
        return name;
    }
    public static double  Input1() {
        double area;
        while (true) {
            try{
                System.out.println("Nhập vào diện tích sử dụng: ");
                area = Double.parseDouble(scanner.nextLine());
                if(area>30){
                    break;
                }else{
                    System.out.println("sai rồi!!");
                }
            }catch(NumberFormatException e){
                System.out.println("sai định dạng số!!");
            }
        }
        return area;
    }
    public static int Input2() {
        int total;
        while (true) {
            try{
                System.out.println("Nhập vào chi phí thuê: ");
                total = Integer.parseInt(scanner.nextLine());
                if(total>0){
                    break;
                }else{
                    System.out.println("chi phí dương");
                }
            }catch(NumberFormatException e){
                System.out.println("sai định dạng số");
            }
        }
        return total;
    }
    public static int Input3(){
        int maxPeople;
        while(true){
            try{
                System.out.println("Số lượng người tối thiểu trong house: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
                if(maxPeople>0 && maxPeople<20){
                    break;
                }else{
                    System.out.println("Số lượng người tối đa phải >0 và nhỏ hơn <20!!");
                }
            }catch(NumberFormatException e){
                System.out.println("sai định dạng");
            }
        }
        return maxPeople;
    }

    public static String Input4() {
        String kt;
        while (true) {
            kt = scanner.nextLine();
            if (Pattern.matches(REGEX_STRING, kt)) {
                break;
            } else {
                System.out.println("sai định dạng !!");
            }
        }
        return kt;
    }
    public static int Input5(){
        int room;
        while(true){
            System.out.println("Nhập dô số phòng!!");
            room = Integer.parseInt(scanner.nextLine());
            try{
                if(room>0){
                    break;
                }else{
                    System.out.println("Số phòng nguyên dương !!");
                }
            }catch(NumberFormatException e){
                System.out.println("Sai đinj dạng!!");
            }
        }
        return room;
    }


}
