package leetcode;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_401 {
    //4小时，6分钟
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        if (num > 10) {
            return list;
        }
        Map<Integer, List<Integer>> a = new HashMap<>();
        Map<Integer, List<Integer>> b = new HashMap<>();
        a.put(0, Arrays.asList(0));
        a.put(1, Arrays.asList(1, 2, 4, 8));
        a.put(2, Arrays.asList(3, 5, 6, 9, 10));
        a.put(3, Arrays.asList(7, 11));
        //initialize
        b.put(0, Arrays.asList(0));
        b.put(1, Arrays.asList(1, 2, 4, 8, 16, 32));
        b.put(2, Arrays.asList(3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48));
        b.put(3, Arrays.asList(7, 11, 13, 14, 19, 21, 22, 25, 26, 28, 35, 37, 38, 41, 42, 44, 49, 50, 52, 56));
        b.put(4, Arrays.asList(15, 23, 27, 29, 30, 39, 43, 45, 46, 51, 53, 54, 57, 58));
        b.put(5, Arrays.asList(31, 47, 55, 59));

        for (int i = 0; i <= Math.min(num, 3); i++) {
            List<Integer> aTemp = a.getOrDefault(i, new ArrayList<>());
            List<Integer> bTemp = b.getOrDefault(num - i, new ArrayList<>());
            if (aTemp.size() > 0 && bTemp.size() > 0) {
                for (int x : aTemp) {
                    for (int y : bTemp) {
                        list.add(x + ":" + (y > 9 ? y : "0" + y));
                    }
                }
            }

        }
        return list;
    }

    public List<String> readBinaryWatch0(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }

    public static void main(String[] args) {
        Main_401 main_401 = new Main_401();
        System.out.println(main_401.readBinaryWatch(4));

        System.out.println(Integer.bitCount(3));
    }
}
