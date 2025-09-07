import java.util.Scanner;

public class BitwiseLeftSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to showcase of left side operator");
        System.out.println("please enter the number:");
        int num = input.nextInt();
        int result = num << 4;
        System.out.println("result:" + result);



    }

}
