package leetcode;

/**
 * @author kangkang lou
 */
class Solution extends GuessGame {
    private int target;

    public int guessNumber(int n) {
        if (n < target) {
            return -1;
        } else if (n > target) {
            return 1;
        } else {
            return 0;
        }
    }

    public Solution(int n) {
        this.target = n;
    }
}

public class Main_374 {
}
