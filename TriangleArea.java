import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System .out .println("Welcome to Area Calculator\n ");
        System.out.println("Please enter your base in cms : ");
        double base = input.nextDouble();
        System.out.println( "Now, Please enter your height in cms : ");
        double height  = input.nextDouble();
        double Area = (base * height)/2;
        System.out.println(" Area of your triangle is : " + Area +"cms2" );


    }
}
