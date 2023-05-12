package ss1_java_introduction.practise;

import java.util.Scanner;

public class ex1_LoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hello: "+ name);
    }
}
