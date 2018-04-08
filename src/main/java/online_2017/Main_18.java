package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_18 {

    static int sum(int n, int m) {
        int sum = 0;
        while (n > 0) {
            sum += n % m;
            n /= m;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
    }

    private static int count(int n) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (sum(i, 2) == sum(i, 10)) {
                index++;
            }
        }
        return index;
    }
}
