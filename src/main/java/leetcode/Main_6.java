package leetcode;

/**
 * @author kangkang lou
 */

/**
 * 字符串z字回旋
 * 算法思想：
 * 为了方便理解，我们先构建一个数组，很明显，数组高度为<p>numRows</p>，而数组宽度为<p>s.length()/numRows</p>
 * 根据题解，我们可以得到数组中每"两列"是一个循环。
 * 第一列，只增加i，每次增加1
 * 第二列，i每次减1，同时j加1
 */
public class Main_6 {
    public static String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int w = s.length() % 2 == 0 ? s.length() / 2 : s.length() / numRows + 1;
        char[][] chars = new char[numRows][w];
        int j = 0, i = 0;
        int pos = 0;
        while (pos < s.length()) {
            //第一列，只增加i值，每次增加1
            while (i < numRows) {
                if (pos >= s.length()) {
                    break;
                }
                chars[i][j] = s.charAt(pos);
                i++;
                pos++;
            }
            i = numRows - 1;
            //第二列，i值每次减1，同时j每次增加1
            while (i >= 1) {
                if (pos >= s.length()) {
                    break;
                }
                i = i - 1;
                j = j + 1;
                chars[i][j] = s.charAt(pos);
                pos++;
            }
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < numRows; m++) {
            for (int n = 0; n < w; n++) {
                if ((int) chars[m][n] != 0) {
                    sb.append(chars[m][n]);
                }
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }
}
