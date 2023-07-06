package CaseStudy1.reposity;

import CaseStudy1.model.Booking;

import java.util.TreeSet;

public interface IBookingReposity {
     TreeSet<Booking> findAll();
     TreeSet<Booking> readFromFile(TreeSet<Booking> getBookings);
}
