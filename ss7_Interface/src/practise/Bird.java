package ss7_Interface.src.practise;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("chim có thể bay");
    }
    public void tiengKeu(){
        System.out.println("chim kêu chíp chíp");
    }
}
