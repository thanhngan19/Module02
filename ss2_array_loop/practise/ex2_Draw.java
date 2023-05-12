package ss2_array_loop.practise;

import java.util.Scanner;

public class ex2_Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the Square");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) ");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println(" Draw the Square");
                    Scanner scanner1 = new Scanner(scanner.nextLine());
                    int a, b;
                    do {

                        System.out.println("Nhập vào chiều rộng: ");
                        b = Integer.parseInt(scanner.nextLine());
                        if (b < 0) {
                            System.out.println("Nhập sai chiều rộng!");
                        }
                    } while (b < 0);
                    do {
                        System.out.println("Nhập vào chiều dài: ");
                        a = Integer.parseInt(scanner.nextLine());
                        if (a < 0) {
                            System.out.println("Nhập sai chiều dài!");
                        }
                    } while (a < 0);
                    for (int i = 0; i < b; i++) {
                        for (int j = 0; j < a; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(scanner.nextLine());
                    int n;
                    do {
                        System.out.println("Nhập vào chiều cao tam giác ");
                        n = Integer.parseInt(scanner.nextLine());
                        if (n < 0) {
                            System.out.println("k dc");
                        }
                    } while (n < 0);
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = n; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(scanner.nextLine());
                    int c;
                    do {
                        System.out.println("Nhập vào chiều cao tam giác cân ");
                        c = Integer.parseInt(scanner.nextLine());
                        if (c < 0) {
                            System.out.println("k dc");
                        }
                    } while (c < 0);
                    for (int i = 1; i <= c; i++) {
                        for (int j = 1; j <= c - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);// ket thuc chuong trinh
                    break;
            }
        }
    }
}

