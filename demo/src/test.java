import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày:");
        String dateNew = scanner.nextLine();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd-MM-yyyy][d-M-yyyy]");
        LocalDate startDate = LocalDate.parse(dateNew, formatter1);
        System.out.println(startDate);
        LocalDate now= LocalDate.now();
        System.out.println(now);
        if(startDate.isAfter(now)){
            System.out.println("ngan");
        }else{
            System.out.println("chs");
        }
}}
