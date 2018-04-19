package leetcode;

import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] result = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                result[j] = Math.min(result[j], result[j + 1]) + triangle.get(i).get(j);
            }
        }
        return result[0];
    }

    public static void main(String[] args) {

    }
}
