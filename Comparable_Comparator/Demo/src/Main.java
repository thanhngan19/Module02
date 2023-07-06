import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tuổi : ");
                number = Integer.parseInt(sc.nextLine());
                if (number > 100) {
                    throw new ArithmeticException("Tuổi không hợp lệ !");
                } else {
                    System.out.println(number);
                    break;

                }
            } catch (NumberFormatException e) {
                System.out.println("k đúng đinh dạng!");
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
        }

    }
}
