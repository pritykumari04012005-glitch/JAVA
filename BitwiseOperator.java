import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println((" Showcasing bitwise And operator"));
        System.out.println("please the the first number: ");
        int first = input.nextInt();
        System.out.println("Now ,please enter the second number: ");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("result is " + result);

    }
}
