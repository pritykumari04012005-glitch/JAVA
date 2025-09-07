import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the  number that player  guessed
     * @return
     * - Negative if the guessed number  is smaller
     * - 0 if the guessed number is correct.
     * - Positive if the guessed number is higher.
     */
    int  guess (int guessNumber) {
        return guessNumber - random;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("welcome to the guessing game.Guess the number between 1-100");
        int guess;
        int result = 0;
        do {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("congrats ,your Guess is correct");
        }else if(result < 0){
                System.out.println("please Guess Higher");
            }else {
                System.out.println("please Guess Lower");
            }
        } while (result != 0);

    }
}
