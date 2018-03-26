package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_72 {
    static String format(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sb.append("*");
                sb.append(str.charAt(i));
                sb.append("*");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().replaceAll("\\*\\*", "");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(format(str));
        }
    }
}
