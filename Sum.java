import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator" );
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now ,Please enter your second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum +secondNum;
        System.out.println("Sum of your numbers is : "+ sum );
    }
}
