package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_40 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] weights = new int[n];
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = cin.nextInt();
            }
            for (int i = 0; i < n; i++) {
                numbers[i] = cin.nextInt();
            }
            int result = compute(n, weights, numbers);
            System.out.println(result);
        }
    }

    public static int compute(int n, int[] weights, int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= numbers[0]; i++) {
            set.add(i * weights[0]);
        }
        for (int i = 1; i < n; i++) {
            //从第二个砝码开始
            List<Integer> list = new ArrayList<>(set);
            for (int j = 1; j <= numbers[i]; j++) {
                //遍历砝码的个数
                for (int k = 0; k < list.size(); k++) {
                    set.add(list.get(k) + j * weights[i]);
                }
            }
        }
        return set.size();
    }
}
