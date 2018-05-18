package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_274 {
    public int hIndex(int[] citations) {
        if (citations.length == 0) {
            return 0;
        }
        Arrays.sort(citations);
        int len = citations.length;
        if (citations[0] >= len) {
            return citations.length;
        }
        if (citations[citations.length - 1] <= 0) {
            return 0;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (len - i >= citations[i]) {
                if (len - i == citations[i]) {
                    return len - i > 0 ? len - i : 1;
                }
                return len - i - 1 > 0 ? len - i - 1 : len == 1 ? 0 : 1;
            }
        }
        return citations[0] > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 4, 4};
        System.out.println(new Main_274().hIndex(arr));
    }
}
