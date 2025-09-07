//create a program using continue to sum all the positive numbers entered by the user
//;skip any negative numbers


public class SumPositive {
    public static void main(String[] args) {
        System.out.println("welcome to adding positive numbers.");
        int [] numArr = ArrayUtility.inputArray();


        int sum = 0;
        for (int num : numArr){
            if (num < 0 ){
                continue;
            }
            sum += num;
        }
        System.out.println("the sum of positive number is : " + sum);
    }
}
