import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the leap year Calculator \n");
        System.out.println("please enter the year that you want to check : ");
        int year = input.nextInt();


        if(year % 400 == 0){
            System.out.println("your year is leap year ");
        }else if ( year % 100 ==0){
            System.out.println("your is not leap year ");
        }else if (year % 4 == 0){
            System.out.println("your year is leap year ");

        }else {
            System.out.println("your year is not leap year ");
        }
    }
}
