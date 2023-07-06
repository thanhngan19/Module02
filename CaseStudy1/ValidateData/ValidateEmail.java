package CaseStudy1.ValidateData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    static Scanner scanner = new Scanner(System.in);
    public static String Email() {
        String email1;
        while (true) {
            System.out.println("Nhập vào email: ");
            email1 = scanner.nextLine();
            String mp = "^[a-zA-Z][a-zA-Z0-9]+@gmail.com";
            if (Pattern.matches(mp, email1)) {
                return email1;
            } else {
                System.out.println("email không hợp lệ !!");
            }
        }
    }
}
