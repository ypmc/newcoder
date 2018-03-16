package newcoder;


import java.util.HashMap;

/**
 * @author kangkang lou
 */

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class DuplicateNumber {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result = false;
        for (int i = 0; i < length; i++) {
            int k = numbers[i];
            if (map.containsKey(k)) {
                duplication[0] = k;
                result = true;
                break;
            } else {
                map.put(k, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
