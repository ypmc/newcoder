package leetcode;

/**
 * @author kangkang lou
 */
public class Main_167 {
    public int[] twoSum(int[] numbers, int target) {
        int s = 1;
        int e = numbers.length;
        int[] result = new int[2];
        while (s < e) {
            int temp = numbers[s - 1] + numbers[e - 1];
            if (temp == target) {
                result[0] = s;
                result[1] = e;
                break;
            } else if (temp < target) {
                s++;
            } else {
                e--;
            }
        }
        return result;
    }

}
