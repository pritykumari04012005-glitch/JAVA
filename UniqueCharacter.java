import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your string: ");
        String userStr = input.next();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);

        }
        System.out.printf("your string has %d unique characters",
                unique.size());


    }
}
