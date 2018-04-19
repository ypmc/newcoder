package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }

        List<Integer> list = new ArrayList<>();
        if (numRows == 1) {
            list.add(1);
            lists.add(list);
            return lists;
        }
        if (numRows == 2) {
            list.clear();
            list.add(1);
            lists.add(list);
            list = new ArrayList<>();
            list.add(1);
            list.add(1);
            lists.add(list);
            return lists;
        }
        lists = generate(2);
        int index = 2;
        while (index < numRows) {
            List<Integer> temp = lists.get(lists.size() - 1);
            list = new ArrayList<>();
            list.add(1);
            for (int i = 0; i < temp.size() - 1; i++) {
                list.add(temp.get(i) + temp.get(i + 1));
            }
            list.add(1);
            lists.add(list);
            index++;
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(3));
        System.out.println(generate(4));
    }
}
