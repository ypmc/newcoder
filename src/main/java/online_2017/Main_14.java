package online_2017;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 *
 */
public class Main_14 {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pair> list = new ArrayList<Pair>();
        while (in.hasNext()) {
            Pair<String, String> pair = new Pair<>(in.next(), in.next());
            list.add(pair);
        }
        for (Pair<String, String> pair : list) {
            sum(pair);
        }
    }

    private static void sum(Pair<String, String> pair) {
        String a = pair.getKey();
        String b = pair.getValue();
        if (a.replaceAll("[0-9]", "").length() != 0 || b.replaceAll("[0-9]", "").length() != 0) {
            System.out.println("error");
        } else {
            BigInteger m = new BigInteger(a);
            BigInteger n = new BigInteger(b);
            System.out.println(m.add(n));
        }
    }
}
