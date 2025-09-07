import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("welcome to world of three \n  ");
        System.out.print("please enter the first number : ");

            int first = input.nextInt();
        System.out.print("Now, please enter the second number : ");
        int second  = input.nextInt();

        System.out.print("Finally,enter the third number: ");
        int third = input.nextInt();

        if(first >= second && first >= third){
            System.out.println( first + " is the greatest number");
        }else if (second >= third) {
            System.out.println(second + " is the greatest number");
        } else{
            System.out.println(third + " is the greatest number");

        }

    }
}
