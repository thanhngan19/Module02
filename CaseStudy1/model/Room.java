package CaseStudy1.model;

public class Room extends Facility{
    String link;

    public Room(String name, double area, int total, int maxPeople, String kt, String link) {
        super(name, area, total, maxPeople, kt);
        this.link = link;
    }


}
