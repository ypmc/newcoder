package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(1);
        if (rowIndex < 0) {
            return new ArrayList<>();
        }
        if (rowIndex == 0) {
            return a;
        }
        if (rowIndex == 1) {
            return b;
        }

        List<Integer> temp = getRow(rowIndex - 1);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < temp.size() - 1; i++) {
            list.add(temp.get(i) + temp.get(i + 1));
        }
        list.add(1);
        return list;
    }

    public static void main(String[] args) {

    }
}
