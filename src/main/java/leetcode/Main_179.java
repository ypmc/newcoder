package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_179 {
    public static String largestNumber(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int v : nums) {
            list.add(v);
        }
        Collections.sort(list, (Integer o1, Integer o2) -> (o2 + "" + o1).compareTo(o1 + "" + o2));
        StringBuilder sb = new StringBuilder();
        for (int v : list) {
            if (v == 0 && sb.toString().length() == 0) {
                continue;
            } else {
                sb.append(v);
            }
        }
        return sb.toString().length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }
}
