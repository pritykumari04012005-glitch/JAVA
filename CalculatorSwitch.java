// create a program to create a simple basic calculator that  uses a switch statement to perform
// basic arithmetic operations like addition ,subtraction, multiplication and division.


import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculator\n");
        System.out.println("please enter your  first number: ");
        int num1 = input.nextInt();
        System.out.println("please enter your  second number: ");
        int num2 = input.nextInt();
        System.out.print("now ,  enter the operation: ");
        String operation = input.next();

        int result = switch (operation) {
            case "+"  -> num1 + num2;
            case "-"  -> num1 - num2;
            case "*" -> num1 * num2;
            case "/"  -> num1 / num2;

            default ->  -1;
        };
        System.out.println("your answer is: " + result);
    }
}
