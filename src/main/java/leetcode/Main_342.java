package leetcode;

/**
 * @author kangkang lou
 */
public class Main_342 {
    public boolean isPowerOfFour(int num) {
        if (num > 1)
            while (num % 4 == 0) num /= 4;
        return num == 1;
    }

    public static void main(String[] args) {

    }
}
