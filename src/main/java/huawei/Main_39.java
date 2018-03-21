package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_39 {
    static void count(String str) {
        int a = 0, b = 0, m = 0, n = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                a++;
            } else if (c == ' ') {
                b++;
            } else if (c >= '0' && c <= '9') {
                m++;
            } else {
                n++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            count(str);
        }
    }
}
