package newcoder;

import java.util.HashMap;

/**
 * @author kangkang lou
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                if (map.get(array[i]) >= array.length / 2) {
                    return array[i];
                }
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        return result;
    }
}
