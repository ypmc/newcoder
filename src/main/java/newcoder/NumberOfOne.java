package newcoder;

/**
 * @author kangkang lou
 */

/**
 * 1到N之间1的个数
 */
public class NumberOfOne {

    public int NumberOf1Between1AndN_Solution(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("1")) {
                total += num(i);
            }
        }
        return total;
    }

    public int num(int num) {
        String s = String.valueOf(num);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
