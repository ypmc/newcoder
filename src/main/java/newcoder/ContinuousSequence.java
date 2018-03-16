package newcoder;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class ContinuousSequence {

    /**
     * 根据数学公式计算:(a1+an)*n/2=s  n=an-a1+1
     * (an+a1)*(an-a1+1)=2*s=k*l(k>l)
     * an=(k+l-1)/2  a1=(k-l+1)/2
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum < 3) return list;
        int s = (int) Math.sqrt(2 * sum);
        for (int i = s; i >= 2; i--) {
            if (2 * sum % i == 0) {
                int d = 2 * sum / i;
                if (d % 2 == 0 && i % 2 != 0 || d % 2 != 0 && i % 2 == 0) {
                    int a1 = (d - i + 1) / 2;
                    int an = (d + i - 1) / 2;
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int j = a1; j <= an; j++)
                        temp.add(j);
                    list.add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
