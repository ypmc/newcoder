package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            int n = in.nextInt();
            int m = 0;
            int t = 0;
            float sum = 0f;
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                if (temp < 0) {
                    m++;
                } else if (temp == 0) {
                    t++;
                } else {
                    sum += temp;
                }
            }
            if (sum % (n - m - t) == 0) {
                System.out.println(m + " " + (int)sum / (n - m - t));
            } else {
                System.out.println(m + " " + String.format("%.1f", sum / (n - m - t)));
            }
        }

    }
}
