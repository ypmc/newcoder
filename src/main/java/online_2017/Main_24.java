package online_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 数字组合，深度优先遍历
 */

public class Main_24 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            dfs(1, m, n);

            for (ArrayList<Integer> l : res) {
                for (int i = 0; i < l.size(); i++) {
                    if (i == l.size() - 1) {
                        System.out.println(l.get(i));
                    } else {
                        System.out.print(l.get(i) + " ");
                    }
                }

            }
        }
    }

    public static void dfs(int index, int count, int n) {
        if (count == 0) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = index; i <= count && i <= n; i++) {
                list.add(i);
                dfs(i + 1, count - i, n);
                list.remove(list.size() - 1);
            }
        }
    }
}