package online;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 水仙花
 */
public class Main_5 {
    static class Pair<K, V> {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    static boolean isNarcissus(int m) {
        int a = m / 100;
        int c = m % 10;
        int b = (m - a * 100) / 10;
        return m == a * a * a + b * b * b + c * c * c;
    }

    static void narcissistic(int m, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isNarcissus(i)) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim().length() > 0 ? sb.toString().trim() : "no");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pair> list = new ArrayList<>();
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            Pair<Integer, Integer> pair = new Pair<>(m, n);
            list.add(pair);
        }
        for (Pair<Integer, Integer> p : list) {
            narcissistic(p.getKey(), p.getValue());
        }
    }
}
