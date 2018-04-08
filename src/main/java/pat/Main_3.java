package pat;

/**
 * @author kangkang lou
 * <p>
 * 素数
 * <p>
 * 素数
 * <p>
 * 素数
 */

/**
 * 素数
 */

import java.util.Scanner;
public class Main_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int begin = in.nextInt();
        int end = in.nextInt();
        in.close();
        int[] array = new int[end];
        int index = 0;
        int i = 2;
        while (index < end) {
            if (isPrime(i)) {
                array[index] = i;
                index++;
            }
            i++;
        }
        int ten = 0;
        for (int j = (begin - 1); j < end; j++) {
            System.out.print(array[j]);
            ten++;
            if (ten % 10 == 0) {
                System.out.println();
                continue;
            }
            if (j != end - 1) {
                System.out.print(" ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
