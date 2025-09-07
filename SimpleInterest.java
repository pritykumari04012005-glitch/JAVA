import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to your simple interest calculator\n");
        System.out.print("please enter principle in rs:");
        int P = input.nextInt();
        System.out.print("please enter time in year: ");
        int T= input.nextInt();
        System.out.print("Now, please enter rate :");
        int R = input.nextInt();
        int interest  =( P * R * T)/100;
        System.out.println("Rusult :" +  interest);
        //my first program i wrote without any help

    }
}
