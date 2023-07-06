package CaseStudy1.model;

public class Contracts{
    int MHD;
    int idBooking;
    double firstMoney;
    double Sum;
    int mkh;


    public Contracts(int MHD, int idBooking, double firstMoney, double sum, int mkh) {
        this.MHD = MHD;
        this.idBooking = idBooking;
        this.firstMoney = firstMoney;
        Sum = sum;
        this.mkh = mkh;
    }

    public Contracts() {
    }

    public int getMHD() {
        return MHD;
    }

    public void setMHD(int MHD) {
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

    @Override
    public String toString() {
        return "Contracts{" +
                "MHD='" + MHD + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", firstMoney=" + firstMoney +
                ", Sum=" + Sum +
                ", mkh=" + mkh +
                '}';
    }
}

