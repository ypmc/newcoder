package leetcode;

/**
 * @author kangkang lou
 */
public class Main_300 {
    public int lengthOfLIS(int[] a) {
        int[] m = new int[a.length];
        for (int i = 0; i < m.length; i++) {
            m[i] = 1;
        }
        int[] seq = new int[a.length];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = -1;
        }
        int max = 0;
        int k = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] > a[j]) {
                    if (m[i] < m[j] + 1) {
                        seq[i] = j;
                    }
                    m[i] = Math.max(m[j] + 1, m[i]);
                }

                if (m[i] > max) {
                    max = m[i];
                    k = i;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (k != -1) {
            sb.append(a[k]);
            k = seq[k];
        }
        int result = 0;
        for (int i = 0; i < m.length; i++) {
            result = Math.max(m[i], result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(new Main_300().lengthOfLIS(arr));
    }
}
