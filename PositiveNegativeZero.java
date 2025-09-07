import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number checker :");
        System .out .print("please enter your number : ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.print("your number is positive");

        }else if (num == 0) {
            System.out .print(" your number is zero");
        }
        else {
            System.out.print("your number is negative");
        }
    }
}
