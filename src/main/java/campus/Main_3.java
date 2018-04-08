package campus;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int o = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == o) {
                o *= 2;
            }
        }
        System.out.println(o);

    }
}
