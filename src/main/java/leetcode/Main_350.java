package leetcode;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b = 0;
        while (a < nums1.length && b < nums2.length) {
            if (nums1[a] < nums2[b]) {
                a++;
            } else if (nums1[a] > nums2[b]) {
                b++;
            } else {
                result.add(nums1[a]);
                a++;
                b++;
            }
        }
        int[] arr = new int[result.size()];
        int pos = 0;
        for (int i : result) {
            arr[pos++] = i;
        }
        return arr;
    }

    public int[] intersect0(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 1};
        System.out.println(Arrays.toString(new Main_350().intersect(a, b)));
        System.out.println(Arrays.toString(new Main_350().intersect0(a, b)));
    }
}
