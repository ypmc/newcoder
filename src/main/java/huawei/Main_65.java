package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 字串大写个数
 */
public class Main_65 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(count(str));
        }
    }

    private static int count(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index++;
            }
        }
        return index;
    }
}
