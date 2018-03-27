package online;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */
public class Main_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            replace(a, b);
        }

    }

    private static void replace(String a, String b) {
        String s = "[" + b + "]";
        Pattern p = Pattern.compile(s);
        System.out.println(a.replaceAll(p.pattern(), ""));
    }
}
