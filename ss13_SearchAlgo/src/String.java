import java.util.LinkedList;
import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        LinkedList<Character> max = new LinkedList<>();
        java.lang.String str= scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            max.add(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)>max.getLast()){
                    max.add(str.charAt(j));
                }
            }
        }
        for(Character ch: max){
            System.out.println(ch);
        },

    }
}
