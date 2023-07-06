package CaseStudy1.until;

import CaseStudy1.model.Booking;
import CaseStudy1.model.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class BookingWriteFile {
     static  String STRING_PATH ="E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Booking.csv";
    public static TreeSet<Booking> WriteFile(TreeSet<Booking> bookings) {
        File file = new File(STRING_PATH);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            for(Booking ch:bookings){
                buff.write(ch.toString());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings ;
    }
    }

