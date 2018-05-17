package leetcode;

/**
 * @author kangkang lou
 */
public class Main_258 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int total = 0;
        while (num > 0) {
            total += num % 10;
            num /= 10;
        }
        return addDigits(total);
    }

    public int addDigits0(int num) {
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }

    public static void main(String[] args) {
        System.out.println(new Main_258().addDigits(38));
        System.out.println(new Main_258().addDigits0(38));
    }
}
