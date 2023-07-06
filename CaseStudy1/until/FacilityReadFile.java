package CaseStudy1.until;

import CaseStudy1.model.Booking;
import CaseStudy1.model.Facility;
import CaseStudy1.model.House;
import CaseStudy1.model.count;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class FacilityReadFile {
    static LinkedHashMap <count,House> house = new LinkedHashMap<count,House>();

    public static  LinkedHashMap <count,House> ReadFile(String path) {

        File file = new File(path);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader reader2 = new BufferedReader(reader);
            String line = "";
            while ((line = reader2.readLine()) != null) {
                String[] strings = line.split(",");
                String name = strings[1];
                double area = Double.parseDouble(strings[2]);
                int total = Integer.parseInt(strings[3]);
                int maxPeople = Integer.parseInt(strings[4]);
                String kt = strings[5];
                String standard = strings[6];
                int floor = Integer.parseInt(strings[7]);
                int countdemo = Integer.parseInt(strings[0]);
                House housef = new House(name, area, total, maxPeople, kt,standard,floor );
                count counttest = new count(countdemo);
                house.put(counttest,housef);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return house;
    }
}
