package CaseStudy1.model;

public class Contracts{
    String MHD;
    double firstMoney;
    double Sum;


    public Contracts(String MHD, double firstMoney, double sum) {
        this.MHD = MHD;
        this.firstMoney = firstMoney;
        Sum = sum;
    }

    public String getMHD() {
        return MHD;
    }

    public void setMHD(String MHD) {
        this.MHD = MHD;
    }

    public double getFirstMoney() {
        return firstMoney;
    }

    public void setFirstMoney(double firstMoney) {
        this.firstMoney = firstMoney;
    }

    public double getSum() {
        return Sum;
    }

    public void setSum(double sum) {
        Sum = sum;
    }

}

