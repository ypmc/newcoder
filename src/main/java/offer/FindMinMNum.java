package offer;

import java.util.ArrayList;

/**
 * @author kangkang lou
 */
public class FindMinMNum {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k == 0) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            isValidNum(list, input[i]);
        }
        return list;
    }

    public void isValidNum(ArrayList<Integer> list, int num) {
        int temp = list.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > temp) {
                temp = list.get(i);
                index = i;
            }
        }
        if (temp > num) {
            list.set(index, num);
        }

    }

    public static void main(String[] args) {

    }
}
