package CaseStudy1.model;

public class Booking  {

    String idBooking;
    String startDate;
    String endDate;

    public Booking(String idBooking, String startDate, String endDate) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}
