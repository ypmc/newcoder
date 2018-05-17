package leetcode;

/**
 * @author kangkang lou
 */
public class Main_263 {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                break;
            }
        }
        while (num > 0) {
            if (num % 3 == 0) {
                num /= 3;
            } else {
                break;
            }
        }
        while (num > 0) {
            if (num % 5 == 0) {
                num /= 5;
            } else {
                break;
            }
        }
        return num == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new Main_263().isUgly(14));
    }
}
