import java.util.Scanner;

//Create a program to find number of occurrences of an elements in an array
public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to  array occurrences \n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrence(numArr,num);
        System.out.println("your element was found " + occurrences + " times in the array ");
    }

    public static int noOfOccurrence(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
        }
        i++;
    }
      return occ;
}
}
