package newcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class NumbersWithSum {

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, len = array.length - 1; i < len; i++) {
            int temp = array[i];
            if (!map.containsKey(temp)) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == sum - temp) {
                        map.put(temp, sum - temp);
                        break;
                    }
                }
            }

        }
        if (map.size() == 1) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                list.add(entry.getKey());
                list.add(entry.getValue());
            }
        } else {
            boolean flag = false;
            int temp = 0;
            int k = 0;
            int v = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (!flag) {
                    temp = entry.getKey() * entry.getValue();
                    k = entry.getKey();
                    v = entry.getValue();
                    flag = true;
                } else {
                    if (temp > entry.getKey() * entry.getValue()) {
                        k = entry.getKey();
                        v = entry.getValue();
                    }
                }
            }
            if (flag) {
                list.add(k);
                list.add(v);
            }
        }

        return list;
    }

    public static ArrayList<Integer> FindNumbersWithSum1(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            }
            while (i < j && array[i] + array[j] > sum) --j;
            while (i < j && array[i] + array[j] < sum) ++i;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        System.out.println(FindNumbersWithSum(arr, 15));
    }


}
