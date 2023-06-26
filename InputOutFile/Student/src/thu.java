import java.util.ArrayList;

public class thu {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "dog");
        Animal animal1 = new Animal(1, "dog");
        Animal animal2 = new Animal(1, "dog");
        Animal animal3 = new Animal(1, "dog");
         ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(animal);
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
    }
}
