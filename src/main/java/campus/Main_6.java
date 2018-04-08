package campus;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        Arrays.sort(h);
        int max = Math.max(h[1] - h[0], h[n - 1] - h[n - 2]);
        for (int i = 0; i < n - 2; i++) {
            max = Math.max(max, h[i + 2] - h[i]);
        }
        System.out.println(max);
    }
}
