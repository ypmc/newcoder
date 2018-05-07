package leetcode;

/**
 * @author kangkang lou
 */
public class Main_191 {

    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) - '0';
        }
        return count;
    }
}
