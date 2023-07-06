package CaseStudy1.service;

import CaseStudy1.model.Booking;
import CaseStudy1.model.Contracts;
import CaseStudy1.model.Employee;
import CaseStudy1.reposity.BookingReposity;
import CaseStudy1.reposity.ContactReposity;
import CaseStudy1.reposity.IBookingReposity;
import CaseStudy1.reposity.IContactReposity;

import java.util.*;

public class ContactService implements IContactService{
    static IBookingReposity level = new BookingReposity();
    static TreeSet<Booking> newBooking= level.findAll();

    static IContactReposity getContact= new ContactReposity();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contracts> Contracts= getContact.findAll();
    static Scanner scanner = new Scanner(System.in);

    public ArrayList<Contracts> addNew() {
        Queue<Booking> newQueue1 = new LinkedList<Booking>();
        String pattern = "SVHO[0-9]";
        String pattern2 = "SVVL[0-9]";
        for (Booking b : newBooking) {
            if (b.getLoaidichvu().matches(pattern) || b.getLoaidichvu().matches(pattern2)) {
                newQueue1.add(b);
            }
        }
        Booking needAdd = null;

        Queue<Booking> remove = new LinkedList<Booking>();
        for (Booking nhh : newQueue1) {
            for (Contracts ch : Contracts) {
                if (nhh.getIdBooking() == ch.getIdBooking()) {
                    remove.add(nhh);
                }
            }
        }
        try {
            for (Booking ch : remove) {
                newQueue1.remove(ch);
            }
        } catch (Exception e) {
          e.getMessage();
        }
            if(newQueue1.size()>0){
                System.out.println("danh sách cần tạo contracts là!!");
                for (Booking nh : newQueue1) {
                    System.out.println(nh);
                }
                needAdd = newQueue1.remove();
                System.out.println("Booking cần tạo hợp đồng là: " + needAdd);
            }else{
                System.out.println("Hết booking để tạo hợp đồng!!!");
            }
        int idContract = getContact.size() + 1;
        int idBooking = needAdd.getIdBooking();

        Double fistMoney;
        while (true) {
            try {
                System.out.println("Tiền cọc trước: ");
                fistMoney = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai ddinhj dangj!!");
            }
        }

        Double sumMoney;
        while (true) {
            try {
                System.out.println("Tổng tiền của hợp đồng: ");
                sumMoney = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai ddinhj dangj!!");
            }
        }

        int idCustomer = needAdd.getMkh();
        Contracts newContracts = new Contracts(idContract, idBooking, fistMoney, sumMoney, idCustomer);
        Contracts.add(newContracts);
        ArrayList<Contracts> add = null;
        try {
            add = getContact.writeFile(Contracts);
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("ghi file k thành công!!");
        }
        newQueue1.remove(needAdd);
        return add;
    }
    public void Display(){
        for(Contracts ch:Contracts ){
            System.out.println(ch);
        }
    }
    public void fixInfo(){
        System.out.println("Nhập vào mã hợp đồng muốm sửa: ");
        int idFixx = Integer.parseInt(scanner.nextLine());
        int New;
        int choose;
        do {
            System.out.println("Nhập thông tin muốn sửa!!");
            System.out.println("1.tiền cọc");
            System.out.println("2. Tổng tiền");
            System.out.println("3.Dừng");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập tiền cọc mới: ");
                    Double newMoney = Double.parseDouble(scanner.nextLine());
                    ArrayList<Contracts> contracts = new ArrayList<Contracts>();
                    for (Contracts ch : Contracts) {
                        if (ch.getMHD() == idFixx) {
                            ch.setFirstMoney(newMoney);
                            contracts = getContact.writeFile(Contracts);
                        }
                    }
                    System.out.println("List sau khi sửa");
                    for (Contracts ch : Contracts) {
                        System.out.println(ch);
                    }
                    break;
                case 2:
                    System.out.println("Nhập tiền tổng tiền mới: ");
                    Double sum = Double.parseDouble(scanner.nextLine());
                    ArrayList<Contracts> contractsum = new ArrayList<Contracts>();
                    for (Contracts ch : Contracts) {
                        if (ch.getMHD() == idFixx) {
                            ch.setSum(sum);
                            contractsum = getContact.writeFile(Contracts);
                        }
                    }
                    System.out.println("List sau khi sửa");
                    for (Contracts ch : Contracts) {
                        System.out.println(ch);
                    }
                    break;

            }
        } while (choose >= 1&& choose<=2);
    }
}