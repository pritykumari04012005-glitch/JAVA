   //create a program to find  the minimum of two numbers.

   import java.util.Scanner;

   public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to finding minimum\n");
        System.out.println("please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Now, Please enter your second number: ");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1 ,num2);
        System.out.println("Minimum number is: " +  min);
    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
