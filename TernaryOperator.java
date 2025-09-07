import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the ternary operator checker\n");
        System.out.println("please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Now, enter the second number: ");
        int num2  = input.nextInt();

//        if (num1 > num2){
//            System.out.println(num1 + " is the greatest number  ");
//        }else{
//            System.out.println(num2 + " is the greatest number  ");
//        }
        //  using ternary operator in place of if else condition
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest number ");
    }
}
