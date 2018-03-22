package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

public class Main_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(getMaxSubstring(s1, s2));
        }
        sc.close();
    }

    public static String getMaxSubstring(String s1, String s2) {
        String max = (s1.length() > s2.length()) ? s1 : s2;
        String min = (s1.equals(max)) ? s2 : s1;
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0, k = min.length() - i; k != min.length() + 1; j++, k++) {
                String s = min.substring(j, k);
                if (max.contains(s))
                    return s;
            }
        }
        return null;
    }
}