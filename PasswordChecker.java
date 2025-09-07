import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check ur password\n");
        String password;
        do {
            System.out.println("please enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("thanks for  entering the valid password");
    }
    public static boolean isValidPassword(String password) {

        return password.length()>6;

    }
}
