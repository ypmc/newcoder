package leetcode;

/**
 * @author kangkang lou
 */
public class Main_204 {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        int total = 1;
        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                total++;
            }
        }
        return total;
    }

    static boolean isPrime(int n) {
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
