package CaseStudy1.model;

public class House extends Facility {
    String standard;
    int floor;

    public String getStandard() {
        return standard;
    }



    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public House(String name, double area, int total, int maxPeople, String kt, String standard, int floor) {
        super(name, area, total, maxPeople, kt);
        this.standard = standard;
        this.floor = floor;
    }

    public House(String standard, int floor) {
        this.standard = standard;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", floor=" + floor +
                ", name='" + name + '\'' +
                ", Area=" + Area +
                ", total=" + total +
                ", maxPeople=" + maxPeople +
                ", kt='" + kt + '\'' +
                '}';
    }
}
