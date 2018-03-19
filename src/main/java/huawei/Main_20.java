package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_20 {

    static String isValidPassword(String str) {
        return validLength(str, 8) && composite(str) && sub(str) ? "OK" : "NG";
    }

    static boolean validLength(String str, int len) {
        return str.length() > len;
    }

    static boolean composite(String str) {
        int a = str.replaceAll("\\D", "").length() > 0 ? 1 : 0;
        int b = str.replaceAll("[^a-z]", "").length() > 0 ? 1 : 0;
        int c = str.replaceAll("[^A-Z]", "").length() > 0 ? 1 : 0;
        int d = str.replaceAll("[a-zA-Z0-9]", "").length() > 0 ? 1 : 0;
        return a + b + c + d >= 3;
    }

    static boolean sub(String str) {
        boolean result = true;
        for (int i = 0; i < str.length() - 3; i++) {
            String temp = str.substring(i, i + 3);
            String other = str.substring(i + 3);
            if (other.contains(temp)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(isValidPassword(in.next()));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
