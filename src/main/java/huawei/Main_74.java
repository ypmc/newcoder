package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_74 {
    static int count(int n) {
        int i = 0;
        int count = 0;
        while (i <= n) {
            if (isOk(i)) {
                count++;
                System.out.println(i);
            }
            i++;
        }
        return count;
    }

    static boolean isOk(int n) {
        if (String.valueOf(n * n).endsWith(String.valueOf(n))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(count(in.nextInt()));
        }
    }
}
