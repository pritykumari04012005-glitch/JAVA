import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to temperature calculator : ");
        System.out.println("enter your temp in F : ");
        float fah = input.nextFloat();
        float cel = (fah-32) * 5/9;
        System.out.println("welcome to  temperature calculator: " + cel);


    }
}
