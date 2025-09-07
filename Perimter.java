import java.util.Scanner;

public class Perimter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.println("Please enter all 4 sides in cms: ");
        int  a = input .nextInt();
        int  b = input .nextInt();
        int  c = input .nextInt();
        int  d = input .nextInt();
        int perimeter = a+b+c+d;
        System.out.println("Perimeter of rectangle : " +  perimeter);
    }
}
