package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 平方根求和
 */
public class Main_6 {
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

    static double sum(double m, double n) {
        if (n == 1) {
            return m;
        }
        double a = Math.pow(2, n - 1);
        return sum(m, n - 1) + Math.pow(m, (double) 1 / a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pair<Double, Double>> list = new ArrayList<>();
        while (in.hasNext()) {
            Pair<Double, Double> pair = new Pair<>(in.nextDouble(), in.nextDouble());
            list.add(pair);
        }
        for (Pair<Double, Double> p : list) {
            System.out.println(String.format("%.2f", sum(p.getKey(), p.getValue())));
        }
    }
}
