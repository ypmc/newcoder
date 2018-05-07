package leetcode;

/**
 * @author kangkang lou
 */
public class Main_172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new Main_172().trailingZeroes(40));
    }
}
