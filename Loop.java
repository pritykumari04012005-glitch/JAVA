import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//       int num = 2; //intialization
//        while (num <= 10) {    //condition
//          System.out.println(num);  //action
//          num = num + 1; //updating condition
//        }
//        int count = 500;
//        while (count >= 200){
//            System.out.println(count);
//            count = count - 1;
//            }
        Scanner  input = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            int  inp = input.nextInt();
            System.out.println("Number: " + inp);
        }


  }
}

