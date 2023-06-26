import java.util.Stack;

public class reverseStr {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String str="thanhngan";
        System.out.println("độ dài chuỗi là : "+ str.length());
        for(int i=0;i<str.length();i++){
            stack.push(str.substring(i,i+1));
        }
        System.out.println(stack);
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }
        System.out.println("Reverse String : "+reverse);

    }


}
