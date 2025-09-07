import java.util.Scanner;

public class FloatMultiplication {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System .out.println("We ar doing Float Multiplication\n" );
        System.out.print("Pleas enter first decimal number : ");
        double first = input .nextDouble();
        System.out.println("Now , Please enter second number");
        double second = input .nextDouble();
        double  mul  = first * second;
       System.out.print(" \n Result :" + mul);

    }

}
