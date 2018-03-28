package online;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */

/**
 * 字串包含
 */
public class Main_49 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            find(a, b);
        }
    }

    private static void find(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append("^");
        sb.append("\\S*");
        for (int i = 0; i < b.length(); i++) {
            sb.append(b.charAt(i));
            sb.append("\\S*");
        }
        sb.append("$");
        System.out.println(sb.toString());
        Pattern p = Pattern.compile(sb.toString());
        Matcher m = p.matcher(a);
        System.out.println(m.find() == true ? "Yes" : "No");
    }
}
