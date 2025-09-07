import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd and even\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println("your number is:" + result);
    }
}
