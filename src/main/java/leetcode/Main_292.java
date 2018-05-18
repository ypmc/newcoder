package leetcode;

/**
 * @author kangkang lou
 */
public class Main_292 {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }
        return n % 4 == 0 ? false : true;
    }

    public static void main(String[] args) {

    }
}
