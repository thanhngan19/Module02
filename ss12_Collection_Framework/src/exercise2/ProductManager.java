package exercise2;

import java.util.ArrayList;
import java.util.Scanner;
public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Product pro1 = new Product(1, "Sam Sung", 20.000);
        Product pro2 = new Product(1, "Sam Sung", 20.000);
        Product pro3 = new Product(1, "Sam Sung", 20.000);
        Product pro4 = new Product(1, "Sam Sung", 20.000);
        Product pro5 = new Product(1, "Sam Sung", 20.000);
        Product pro6 = new Product(1, "Sam Sung", 20.000);
        Product pro7 = new Product(1, "Sam Sung", 20.000);
        ArrayList<Product> proMan = new ArrayList<>();
        proMan.add(pro1);
        proMan.add(pro2);
        proMan.add(pro3);
        proMan.add(pro4);
        proMan.add(pro5);
        proMan.add(pro6);
        proMan.add(pro7);
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1.Display");
            System.out.println("2.Add product");
            System.out.println("3.FIx product");
            System.out.println("4.Delete product");
            System.out.println("5.Find product");
            System.out.println("6.SX product");
            System.out.println("7.Exit");
            System.out.println("Input your choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    display(proMan);
                    break;
                case 2:
                    Add(proMan);


            }

        } while (choose<= 1 && choose >= 6);
    }
    public static void display(ArrayList proMan){
        for (Object obj: proMan) {
            System.out.println(obj);
        }
        }
    public static void Add(ArrayList proMan1){
        System.out.println("Input name: ");
        String name1= sc.nextLine();
        System.out.println("Input price: ");
        double price1 = Double.parseDouble(sc.nextLine());
        Product pro8= new Product(8,name1,price1);
        proMan1.add(pro8);
        display(proMan1);

    }
}

