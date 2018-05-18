package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
class MedianFinder {

    List<Integer> list;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        int s = 0;
        int e = list.size() - 1;
        while (s <= e) {
            int pos = s + (e - s) / 2;
            if (list.get(pos) > num) {
                e = pos - 1;
            } else {
                s = pos + 1;
            }
        }
        list.add(s, num);
    }

    public double findMedian() {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (size % 2 == 0) {
            return ((double) list.get(size / 2) + (double) list.get(size / 2 - 1)) / 2;
        } else {
            return list.get((size - 1) / 2);
        }
    }
}

public class Main_295 {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(10);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(5);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(0);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(0);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(9);
        System.out.println(medianFinder.findMedian());
    }
}
