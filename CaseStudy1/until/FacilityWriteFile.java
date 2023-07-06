package CaseStudy1.until;

import CaseStudy1.model.House;
import CaseStudy1.model.count;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

public class FacilityWriteFile {
    static  String STRING_PATH ="E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\House.csv";
    public static LinkedHashMap<count,House> WriteFile(LinkedHashMap<count,House> house) {
        File file = new File(STRING_PATH);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            Set<count> keySet = house.keySet();
            for (count key : keySet) {
//                System.out.println(key + " " + house.get(key));
                buff.write( key.getCount()+","+house.get(key).getName()+","+house.get(key).getArea()+","+house.get(key).getTotal()+","+house.get(key).getMaxPeople()+","+house.get(key).getKt()+","+house.get(key).getStandard()+","+house.get(key).getFloor());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return house;
    }
}
