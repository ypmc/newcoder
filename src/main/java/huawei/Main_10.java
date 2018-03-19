package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_10 {
    static int numOfCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(numOfCharacter(in.next()));
        }
    }
}
