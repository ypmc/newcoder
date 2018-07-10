package leetcode;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Comparator.reverseOrder());
        int min = values.get(k - 1);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= min) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(new Main_347().topKFrequent(arr, 2));
    }
}
