import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the age calculator");
        System.out.print("please enter your age : ");
        int age = input.nextInt();


        if (age >= 65){
            System.out.println("you are a senior citizen");
        }else if(age >= 20 ){
            System.out.println("you are adult");
        }else if (age >= 13){
            System.out.println("you are teenager");
        }else {
            System.out.println("you are child");
        }
    }
}
