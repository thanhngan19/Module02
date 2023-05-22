import java.util.Scanner;

public class ex8_CountString {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a string : ");
        String str= scanner.nextLine();
        System.out.println("String is: "+ str);
        System.out.println("ký tự muốn đếm trong chuỗi: ");
        char n = scanner.next().charAt(0);//một ký tự lấy ký tự đầu trong chuỗi
        int count=0;
        for(int i=0; i<str.length();i++){
            if(n == str.charAt(i)){// so sánh một ký tự sẵn ới một biến mảng thay đổi
                  count++;
            }
        }
        System.out.printf("Số lần xuất hiện của ký tự %s là : %d", n, count);


    }

}
