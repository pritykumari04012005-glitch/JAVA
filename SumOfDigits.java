import java.util.Scanner;

 public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum of digits: ");
        System.out.println("please enter your number: ");
        int num = input.nextInt();
       int sum = sumOfDigit(num) ;
        System.out.println("Sum of digit is: " + sum);

    }
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0){
            sum  += num % 10;
            num /= 10;
        }
        return sum;
    }
}
