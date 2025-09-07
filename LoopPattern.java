import java.util.Scanner;

public class LoopPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are here to print patterns \n");
        System.out.print("please enter the number of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRighHalftPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public  static void printReverseRighHalftPyramid(int maxRow) {
        System.out.println("\n here is  reverse right half pyramid");
        int rows = maxRow;
        while (rows > 0){
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows--;
        }

    }
    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\n here is right half pyramid");
        int rows = 0;
        while (rows < maxRows) {

            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
        public static void printLeftHalfPyramid(int maxRows) {
            System.out.println("\n here is left half pyramid");
            int rows = maxRows;
            while (rows > 0 ) {
                // this loop prints spaces
               int  j = 0;
                while (j < rows-1){
                    System.out.print("  ");

                    j++;
                }
                // this  loop prints *
                int i = 0;
                while (i <= (maxRows-rows)) {
                    System.out.print("* ");
                    i++;
                }
                System.out.println();
                rows--;
            }

        }
    }


