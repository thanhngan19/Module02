package CaseStudy1.reposity;

import CaseStudy1.model.Booking;
//import CaseStudy1.service.DateComparator;
import CaseStudy1.model.Employee;
import CaseStudy1.until.BookingReadFile;
import CaseStudy1.until.BookingWriteFile;
import CaseStudy1.until.EmployeeWriteFile;
import CaseStudy1.until.FacilityWriteFile;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class BookingReposity implements IBookingReposity {
    static String path ="E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Booking.csv";
    static TreeSet<Booking> getBookings = new TreeSet<Booking>();
     public TreeSet<Booking> findAll() {
         return getBookings= BookingReadFile.ReadFile(path);
     }
    public TreeSet<Booking> readFromFile(TreeSet<Booking> getBookings) {
        return BookingWriteFile.WriteFile(getBookings);
    }

}
