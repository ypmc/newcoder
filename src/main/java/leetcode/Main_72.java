package leetcode;

/**
 * @author kangkang lou
 */
public class Main_72 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dif = new int[len1 + 1][len2 + 1];
        for (int a = 0; a <= len1; a++) {
            dif[a][0] = a;
        }
        for (int a = 0; a <= len2; a++) {
            dif[0][a] = a;
        }
        int temp;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    temp = 0;
                } else {
                    temp = 1;
                }
                // 取三个值中最小的  
                dif[i][j] = Math.min(Math.min(dif[i - 1][j - 1] + temp, dif[i][j - 1] + 1),
                        dif[i - 1][j] + 1);
            }
        }
        return dif[len1][len2];
    }

    public static void main(String[] args) {

    }
}
