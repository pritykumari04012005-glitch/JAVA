import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("welcome to number guessing game");
        do {
            System.out.println("please guess the number between 0 and 10");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("you have successfully guessed the number: ");
    }
}
