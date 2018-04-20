package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int best = 0;
        for(int n : set) {
            if(!set.contains(n - 1)) {  // only check for one direction
                int m = n + 1;
                while(set.contains(m)) {
                    m++;
                }
                best = Math.max(best, m - n);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 2, 3};
        System.out.println(new Main_128().longestConsecutive(arr));
    }
}
