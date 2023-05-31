import java.util.Scanner;

public class LoginView{
    static Scanner scanner = new Scanner(System.in);
    public void showMessage(String tx){
        System.out.println(tx);
    }
    public LoginModel getUserInfo(){
        LoginModel user = new LoginModel();
        System.out.println("UserName: ");
        user.setUserName(scanner.nextLine());
        System.out.println("Password: ");
        user.setPassWord(scanner.nextLine());
        return user;
    }
}
