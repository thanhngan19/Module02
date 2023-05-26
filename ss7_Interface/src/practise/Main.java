package ss7_Interface.src.practise;

public class Main {
    public static void main(String[] args) {
//        Animal ani = new CatBaby(1, "kitty","yellow");
//        ani.tiengKeu();
        Animal ani1 = new Bird();
        ((Bird) ani1).fly();
//        ((Flyable) ani1).fly();
    }
}
