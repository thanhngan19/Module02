package ss1_java_introduction.practise;

import java.util.Scanner;

public class ex2_DocSo {
    static String result = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào một số n: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 999) {
                System.out.println("Giá trị nhập vào không hợp lệ vui lòng nhập lại");
            }
        }while(number>999);
        if (number < 10) {
            ZeroToTen(number);
            System.out.println(result);
        }
        if (number > 10 && number <= 20) {
            ElevenToTwenty(number);
            System.out.println(result);
        }
        if (number > 20 && number < 100) {
            int tens = number / 10;
            TwentyToNineTy(tens);
            System.out.print(result);
            int one = number % 10;
            ZeroToTen(one);
            System.out.println(result);
        }
        if (number > 100 && number <= 999) {
            int hun = number / 100;
            HundredToNineHunderedninetynine(hun);
            System.out.println(result);
            int ten = number % 100;
            if (ten >= 1 && ten <= 10) {
                ZeroToTen(ten);
                System.out.print(result);
            }
            if (ten > 10 && ten <= 20) {
                ElevenToTwenty(ten);
                System.out.print(result);
            }
            if (ten > 20 && ten < 100) {
                int ten1 = ten / 10;
                TwentyToNineTy(ten1);
                System.out.print(result);
                int ten2 = ten % 10;
                ZeroToTen(ten2);
                System.out.print(result);
            }
        }
    }

        public static void ZeroToTen(int n) {
        switch (n) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four"; // cuất ra là một string, hàm không có giá tị trả về void.
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
        }

    }

        public static void ElevenToTwenty(int n) {
        switch (n) {
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "telve";
                break;
            case 13:
                result = "thirtheen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eightteen";
                break;
            case 19:
                result = "nineteen";
                break;
            case 20:
                result = "twenty";
                break;
        }
    }

        public static void TwentyToNineTy(int n) {
        switch (n) {
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "fourty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
            case 100:
                result = "hundred";
                break;
        }
    }

    public static void HundredToNineHunderedninetynine(int n) {
        switch (n) {
            case 1:
                result = "one hundred";
                break;
            case 2:
                result = "two hundred";
                break;
            case 3:
                result = "three hundred";
                break;
            case 4:
                result = "four hundred";
                break;
            case 5:
                result = "five hundred"; // cuất ra là một string, hàm không có giá tị trả về void.
                break;
            case 6:
                result = "one hundred";
                break;
            case 7:
                result = "seven hundred";
                break;
            case 8:
                result = "eight hundred";
                break;
            case 9:
                result = "nine hundred";
                break;
        }
    }
}


   
    
