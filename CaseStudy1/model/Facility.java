package CaseStudy1.model;

public class Facility {
    String name;
    double Area;
    int total;
    int maxPeople;
    String kt;


    public Facility(String name, double area, int total, int maxPeople, String kt) {
        this.name = name;
        Area = area;
        this.total = total;
        this.maxPeople = maxPeople;
        this.kt = kt;
    }

    public Facility() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getKt() {
        return kt;
    }

    public void setKt(String kt) {
        this.kt = kt;
    }


}
