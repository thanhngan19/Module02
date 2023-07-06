package CaseStudy1.model;

public class Customer {
    int mkh;
    String name;
    String date;
    String gender;
    String CMND;
    String SDT;
    String email;
    String LKH;
    String DC;

    public Customer() {
    }

    public Customer(int mkh, String name, String date, String gender, String CMND, String SDT, String email, String LKH, String DC) {
        this.mkh = mkh;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.CMND = CMND;
        this.SDT = SDT;
        this.email = email;
        this.LKH = LKH;
        this.DC = DC;
    }




    public int getMkh() {
        return mkh;
    }

    public void setMkh(int mkh) {
        this.mkh = mkh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLKH() {
        return LKH;
    }

    public void setLKH(String LKH) {
        this.LKH = LKH;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mkh=" + mkh +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND='" + CMND + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                ", LKH='" + LKH + '\'' +
                ", DC='" + DC + '\'' +
                '}';
    }
}
