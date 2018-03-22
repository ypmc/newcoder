package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_59 {
    static int lcs(String a, String b) {
        int[][] m = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i < a.length() + 1; i++) {
            for (int j = 1; j < b.length() + 1; j++) {
                if (Character.toUpperCase(a.charAt(i - 1)) == Character.toUpperCase(b.charAt(j - 1))) {
                    m[i][j] = m[i - 1][j - 1] + 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
        int max = 0;
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (max < m[i][j]) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(lcs(a, b));
        }
    }
}
