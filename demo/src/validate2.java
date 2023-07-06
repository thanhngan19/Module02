import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class validate2 {

        public static boolean hopLe(int day, int month, int year) {

        int[] max = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        if (day > max[month] && month != 2) {
            return false;
        }
        if (month > 12 || month<1) {
            System.out.println("tháng lớn hơn 0 và nhỏ hơn 12");
            return false;
        }
        if(year>2023){
            System.out.println("năm nhỏ hơn 2023");
            return false;
        }
            ZonedDateTime zonedDateTime = ZonedDateTime.now();
            int yearNow = zonedDateTime.getYear();
        if((yearNow-year)<18){
            System.out.println("Lớn hơn 18 tuổi!!");
            return false;
        }
        if((yearNow-year)>100){
            System.out.println("tuổi phải nhỏ hơn 100!!");
            return false;
        }


        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (day <= 29) {
                    return true;
                } else {
                    System.out.println("Năm nhuận nên tháng 2 có 29 ngày !!");
                    return false;
                }
            } else {
                if (day <= 28) {
                    return true;
                } else {
                    System.out.println("Năm không nhuận nên tháng 2 chỉ có 28 ngày !!");
                    return false;
                }
            }
        }
        else {
            return true;
        }
    }
        public static LocalDate Date() {
        Scanner scanner = new Scanner(System.in);
        LocalDate startDate  ;
        int day;
        int month;
        int year;
        String dateNew;
        while (true) {
            while (true) {
                try {
                    System.out.println("Nhập ngày:");
                    dateNew = scanner.nextLine();
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]");
                    startDate = LocalDate.parse(dateNew, formatter1);
                    break;
                }catch(DateTimeParseException e){
                    System.out.println("k parse được ngày!!");
                }
            }
            String[] strings = dateNew.split("/");
            day = Integer.parseInt(strings[0]);
            month = Integer.parseInt(strings[1]);
            year = Integer.parseInt(strings[2]);

            if (hopLe(day, month, year)) {
                return startDate;
            }
        }
    }


        public static void main(String[] args) {
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        LocalDate test = Date();
        String date1= formatter1.format(test);
            System.out.println(date1);
    }}

