import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to student score\n");
        System.out.println("please enter your marks: ");
        int marks= input.nextInt();
        String category = marks > 80 ? "High"  : (marks > 50 ? "Moderate" : "low");
        System.out.println("your category is: " + category);
    }
}
