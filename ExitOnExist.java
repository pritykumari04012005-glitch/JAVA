// create a program using break to read the inputs from the user in a loop and break the loop if a specific
// keyword (like "exit") is entered.


import java.util.Scanner;

public class ExitOnExist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("enter your command: ");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }
        System.out.println("you have successfully existed.");
    }
}
