package ss7_Interface.src.practise;

import ss7_Interface.src.practise.Animal;

public abstract class Cat extends Animal  {
    private String color;

    public Cat(int id, String name,String color) {
        super(id, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void tiengKeu(){
        System.out.println("mèo kêu meo meo");
    }
}
