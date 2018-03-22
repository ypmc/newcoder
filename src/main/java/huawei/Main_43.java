package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_43 {
    static String subString(String str, int len) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 0x4e00) && (c <= 0x9fbb)) {
                index = index + 2;
            } else {
                index = index + 1;
            }
            if (index <= len) {
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            int len = in.nextInt();
            System.out.println(subString(str, len));
        }
    }
}
