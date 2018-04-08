package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 最大奇数约数之和
 */
public class Main_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(sumOfMaxOdd(n));
        }
    }

    /*
     * 奇数的最大约数就是本身。问题就是求所有f(i), i为偶数的和。因为要求的是最大奇约数，所以f(2k) = f(k)，所以f(2) + f(4)
     * + ... + f(2k) = f(1) + f(2) + ... + f(k);
     *
     * sum(n) = sum (n / 2) + 1 + 3 + ... + n - 1 = sum (n/2) + n*n/4（n 为偶数）
     *
     *        = sum (n - 1) + n （n为奇数）
     *
     *
     */
    public static long sumOfMaxOdd(long n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return sumOfMaxOdd(n / 2) + n * n / 4;
        } else {
            return sumOfMaxOdd(n - 1) + n;
        }
    }

}