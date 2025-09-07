import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase  of Not /Compliment operator");
        System.out.println("please enter the number: ");
        int number = input.nextInt();
        int  result =  ~ number;
        System.out.println("result: " + result);
    }
}
