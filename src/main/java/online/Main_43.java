package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_43 {
    static void judge(String s) {
        if (!s.toUpperCase().equals(s)) {
            System.out.println("Dislikes");
            return;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (a == b) {
                System.out.println("Dislikes");
                return;
            } else if (s.substring(i + 2).indexOf(String.valueOf(a)) < s.substring(i + 2).indexOf(String.valueOf(b)) && s.substring(i + 2).indexOf(String.valueOf(a)) > -1) {
                System.out.println("Dislikes");
                return;
            }
        }
        System.out.println("Likes");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            judge(s);
        }
    }
}
