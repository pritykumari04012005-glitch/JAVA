import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to compound interest calculator \n");
        System.out.print("Please enter principle amount rs :");
        int principle = input.nextInt();
        System.out.print("Now, tell me your rate of interest :");
        float rate = input.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing this year : ");
        float year = input.nextFloat();
        double compInt = principle *Math.pow(1 +rate/100, year);
        System.out.println("your compound interest is rs : " + compInt);
    }
}
