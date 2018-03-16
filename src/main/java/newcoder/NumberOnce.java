package newcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */

public class NumberOnce {
    /**
     * num1,num2分别为长度为1的数组。传出参数
     * 将num1[0],num2[0]设置为返回结果
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, len = array.length; i < len; i++) {
            int key = array[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
            if (list.size() == 2) {
                break;
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(b);
        System.out.println(a & b);
        System.out.println(a ^ b ^ a);

    }
}
