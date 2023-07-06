import CaseStudy1.model.House;
import CaseStudy1.model.Villa;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        LinkedHashMap<count,house> map = new LinkedHashMap<count,house>();
        house house1 = new house(1,"A");
        house house2 = new house(1,"A");
        house house3 = new house(3,"A");
        house house4 = new house(4,"A");
        house house5 = new house(5,"A");
        count count1 = new count(1);
        count count2 = new count(2);
        count count3 = new count(3);
        count count4 = new count(4);
        count count5 = new count(5);
        map.put(count1,house1);
        map.put(count2,house2);
        map.put(count3,house3);
        map.put(count4,house4);
        map.put(count5,house5);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so: ");
//        int id = Integer.parseInt(sc.nextLine());
        Set<count> keySet = map.keySet();
        for (count key : keySet) {
            System.out.println("số lần sử dụng  "+key.getCount() + " " + map.get(key));}
//            if((map.get(key).getId())== id){
//                int i = key.getCount()+1;
//                key.setCount(i);
//            }
//        }
//        Set<count> keySet1 = map.keySet();
//        for(count key: keySet1){
//            System.out.println(key.getCount()+"  "+ map.get(key));
//        }
    }}

