package CaseStudy1.model;

public class Villa extends Facility {
    String standard;
    double areaPool;
    int Floor;

    public Villa(String name, double area, int total, int maxPeople, String kt, String standard, double areaPool, int floor) {
        super(name, area, total, maxPeople, kt);
        this.standard = standard;
        this.areaPool = areaPool;
        Floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }
}
