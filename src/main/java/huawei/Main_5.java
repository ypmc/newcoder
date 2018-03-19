package huawei;

/**
 * @author kangkang lou
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * 16进制与10进制转换
 */
public class Main_5 {
    static int hex2decimal(String str) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>(32);
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        map.put('a', 10);
        map.put('b', 11);
        map.put('c', 12);
        map.put('d', 13);
        map.put('e', 14);
        map.put('f', 15);
        for (int i = 2; i < str.length(); i++) {
            result = result * 16 + map.get(str.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(hex2decimal(in.next()));
        }
    }
}
