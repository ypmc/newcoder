package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            count(str);
        }
    }

    private static void count(String str) {

        int a = 0;
        int s = -1;
        int e = -1;
        int max = 0;
        for (int i = 0, len = str.length(); i < len; i++) {
            char t = str.charAt(i);
            if (t >= '0' && t <= '9') {
                a++;
                if (s == -1) {
                    s = i;
                }
            } else {
                a = 0;
                s = -1;
            }
            if (max < a) {
                max = a;
                e = i;
            }
        }
        //再次扫描
        s = -1;
        a = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            char t = str.charAt(i);
            if (t >= '0' && t <= '9') {
                a++;
                if (s == -1) {
                    s = i;
                }
                if (a == max) {
                    sb.append(str.substring(s, s + max));
                }
            } else {
                a = 0;
                s = -1;
            }
        }
        System.out.println(sb.toString() + "," + max);

    }
}
