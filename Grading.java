import java.util.Scanner;

public class Grading {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System .out.println("welcome to the Grading calculator\n ");
        System.out.println("please enter the percentage : \n");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("you got the GradedA");
        }else if(percentage >= 75) {
        System.out.println("you got the Grade B");
        }else if (percentage >= 60){
            System.out.println("yoy got the Grade C");

        }else if (percentage >= 30){
            System.out.println("you got the Grade D");
        }else{
            System.out.println("sorry,you failed the test,  you got Grade F");
        }
    }
}
