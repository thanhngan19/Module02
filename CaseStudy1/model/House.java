package CaseStudy1.model;

public class House extends Facility {
    String standard;
    int floor;

    public House(String name, double area, int total, int maxPeople, String kt, String standard, int floor) {
        super(name, area, total, maxPeople, kt);
        this.standard = standard;
        this.floor = floor;
    }


}
