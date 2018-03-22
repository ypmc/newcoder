package huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */
public class Main_55 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String p = in.next();
            String s = in.next();
            System.out.println(judge(p, s));
        }

    }

    static boolean judge(String p, String s) {
        String temp = "^" + p.replace("?", ".").replace("*", "\\w*") + "$";
        Pattern pattern = Pattern.compile(temp);
        Matcher m = pattern.matcher(s);
        return m.find();
    }
}
