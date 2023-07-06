package CaseStudy1.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking>{

    int idBooking;
    LocalDate startDate;
    LocalDate endDate;
    int mkh;

    String madichvu;

    public Booking(int idBooking, LocalDate startDate, LocalDate endDate, int mkh,  String madichvu) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mkh = mkh;
        this.madichvu = madichvu;
    }

    public Booking() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getMkh() {
        return mkh;
    }

    public void setMkh(int mkh) {
        this.mkh = mkh;
    }


    public String getLoaidichvu() {
        return madichvu;
    }

    public void setLoaidichvu(String loaidichvu) {
        this.madichvu = loaidichvu;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]");
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + formatter1.format(startDate) + '\'' +
                ", endDate='" + formatter1.format(endDate) + '\'' +
                ", mkh=" + mkh +
                ", loaidichvu='" + madichvu + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if(o.getIdBooking()== this.getIdBooking()){
            return (this.getIdBooking()-o.getIdBooking());
        }else{
            if(this.getStartDate().isAfter(o.getStartDate())){
                return -1;
            }
            if(this.getStartDate().equals(o.getStartDate())){
                if(this.getEndDate().isAfter(o.getEndDate())){
                    return 1;
                }else{
                    return -1;
                }
            }
        }
        return 1;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return idBooking == booking.idBooking && mkh == booking.mkh && Objects.equals(startDate, booking.startDate) && Objects.equals(endDate, booking.endDate) && Objects.equals(madichvu, booking.madichvu);
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
