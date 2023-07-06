package CaseStudy1.until;

import CaseStudy1.model.Booking;
//import CaseStudy1.service.DateComparator;

import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.TreeSet;

public class BookingReadFile {
    static TreeSet<Booking> bookings = new TreeSet<Booking>();

    public static TreeSet<Booking> ReadFile(String path) {
        File file = new File(path);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader reader2 = new BufferedReader(reader);
            String line = "";
            while ((line = reader2.readLine()) != null) {
                String[] strings = line.split(",");
                Booking book = new Booking();
                book.setIdBooking(Integer.parseInt(strings[0]));
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]");
                LocalDate startDate = LocalDate.parse(strings[1], formatter1);
                book.setStartDate(startDate);;
                LocalDate endDate = LocalDate.parse(strings[2], formatter1);
                book.setEndDate(endDate);
                book.setMkh(Integer.parseInt(strings[3]));
                book.setLoaidichvu(strings[4]);
                bookings.add(book);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookings;
    }
}
