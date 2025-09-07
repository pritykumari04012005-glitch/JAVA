package in.kgcoding;

import java.util.*;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear" , "Lion","Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
