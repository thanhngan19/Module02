import java.util.ArrayList;
import java.util.Scanner;

public class hehe {
    static ArrayList<Animal> list = new ArrayList<Animal>();
    public static void main(String[] args) {
        Animal animal = new Animal(1, "dog");
        Animal animal1 = new Animal(1, "dog");
        Animal animal2 = new Animal(1, "dog");
        Animal animal3 = new Animal(1, "dog");

        list.add(animal);
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        String newName = input(list);
        System.out.println(newName);

    }
    public static String input(ArrayList<Animal>list){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test = new ArrayList<String>();
        while(true){
            System.out.println("nhập: ");
            String name = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).getName()).equals(name)) {
                    test.add(name);

                }
            }
            if (test.size() > 0) {
                System.out.println("sai!!");
                test.clear();// mặc định là false!!!
            }
            else{
                return name;
            }
        }
    }
}
