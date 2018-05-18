package leetcode;

/**
 * @author kangkang lou
 */
public class Main_278 {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int pos;
        while (s < e) {
            pos = s + (e - s) / 2;
            if (isBadVersion(pos)) {
                e = pos - 1;
            } else {
                s = pos + 1;
            }
        }
        return isBadVersion(s) ? s : s + 1;
    }

    boolean isBadVersion(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

    }
}
