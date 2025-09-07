public class Array {
    public static void main(String[] args) {
        //   int [] myArr = new int[5];
//            myArr[0] = 98;
//        myArr[1] = 5;
//        myArr[3] = 65;
//        myArr[4] = 37;
//        myArr[2] = 8;
        int [] myArr= {98,5,37,65,8};
//        int index = 2 ;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
        //Array Traversal
           int index = 0;
           while (index < myArr.length) {
               System.out.println(myArr[index]);
               index++;
           }

    }
}
