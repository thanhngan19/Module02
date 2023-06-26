package RegularExpresstion;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^09\\d{8}$");
        while(true){
            System.out.println("input txt: ");
            String txt = sc.nextLine();
            if(p.matcher(txt).find()){
                System.out.println("oke");
                break;
            }
            else{
                System.out.println("not oke");
            }
        }

    }


}
