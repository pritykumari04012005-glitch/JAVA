import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to the driving license portal");
        System.out.print("please enter your age:");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible");
        }  else {
            System.out.println(" you are not eligible");
        }
    }
}
