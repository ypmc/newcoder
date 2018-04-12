package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */
public class Main_10 {

    static boolean isMatch(String s, String p) {
        String temp = "^" + p + "$";
        Pattern pattern = Pattern.compile(temp);
        Matcher m = pattern.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aab", "c*a*b"));
    }
}
