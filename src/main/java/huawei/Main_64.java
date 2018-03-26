package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_64 {
    static boolean exist(String a, String b) {
        boolean result = true;
        for (int i = 0, len = a.length(); i < len; i++) {
            char c = a.charAt(i);
            if (b.indexOf(String.valueOf(c)) == -1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(exist(a, b));
        }
    }
}
