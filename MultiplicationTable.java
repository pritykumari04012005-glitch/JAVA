import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the Multiplication Table \n");
        System.out.println("please enter your number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + " = " + (num * i));
            i++;
        }

    }
}