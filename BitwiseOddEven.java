import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Odd and Even Calculator");
        System.out.println("please enter your number");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("your number is odd");
        } else {
            System.out.println("your number is even");
        }
    }
}

