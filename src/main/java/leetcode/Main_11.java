package leetcode;

/**
 * @author kangkang lou
 */
public class Main_11 {
    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (result < (j - i) * Math.min(height[i], height[j])) {
                    result = (j - i) * Math.min(height[i], height[j]);
                }
            }
        }
        return result;
    }

    public int maxArea0(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
