package campus;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((i + 1) % 2 == 0) {
                    if (c != 'W') {
                        a++;
                    }
                    if (c != 'B') {
                        b++;
                    }
                } else {
                    if (c != 'B') {
                        a++;
                    }
                    if (c != 'W') {
                        b++;
                    }
                }
            }
            System.out.println(Math.min(a, b));
        }
    }
}
