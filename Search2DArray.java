// create a program to search search an element in a 2-D array.

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to 2D Search \n");
        int [][] numArr = ArrayUtility.input2DArray();
        System.out.println("now enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("your number was found.");
        }else {
            System.out.println("your number was not found.");
        }
    }
    public static boolean search(int[][] numArr,int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                if(numArr[i][j] == num) {
                    return true;
                }
             j++;
            }
            i++;
        }
        return false;
    }
}
