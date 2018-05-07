package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            set.add(a);
        }
        return set.size() != nums.length;
    }

}
