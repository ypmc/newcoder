package leetcode;

/**
 * @author kangkang lou
 */
public class Main_121 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > 0) {
                for (int j = 0; j < i; j++) {
                    if (prices[i] - prices[j] > max) {
                        max = prices[i] - prices[j];
                    }
                }
            }
        }
        return max;
    }

    public int maxProfit0(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1};
        System.out.println(maxProfit(arr));
    }
}
