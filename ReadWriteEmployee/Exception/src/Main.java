import java.util.Scanner;

public class Main {
    static void validate () throws NotFoundIdException {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập: ");
            int age = Integer.parseInt(sc.nextLine());
            if (age < 18)
                throw new NotFoundIdException("not valid");
            else
                break;
        }
    }
    public static void main(String[] args)  {
        while(true){

            try {
                validate();
                break;
            } catch (Exception m) {
                System.out.println("Exception occured: " + m);
            }
        }

            System.out.println("rest of the code...");
        }
    }
