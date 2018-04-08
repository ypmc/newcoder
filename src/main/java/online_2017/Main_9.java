package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 项链截取
 * 有一条彩色宝石项链，是由很多种不同的宝石组成的，包括红宝石，蓝宝石，钻石，翡翠，珍珠等。有一天国王把项链赏赐给了一个学者，并跟他说，你可以带走这条项链，但是王后很喜欢红宝石，蓝宝石，紫水晶，翡翠和钻石这五种，我要你从项链中截取连续的一小段还给我，这一段中必须包含所有的这五种宝石，剩下的部分你可以带走。如果无法找到则一个也无法带走。请帮助学者找出如何切分项链才能够拿到最多的宝石。
 */
public class Main_9 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println(gem(sc.nextLine()));
        sc.close();
    }

    public static int gem(String str) {
        char[] ca = str.toCharArray();
        int len = str.length();
        for (int x = 5; x < len; x++) { // x为截取宝石的个数
            for (int y = 0; y < len; y++) {//y为x确定的情况下迭代的次数
                StringBuilder temp = new StringBuilder();
                for (int z = y; z < y + x; z++) {
                    temp.append(ca[z % len]);
                }
                String t = temp.toString();
                if (t.contains("A") && t.contains("B") && t.contains("C") && t.contains("D") && t.contains("E")) {
                    return len - x;
                }
            }
        }
        return 0;
    }
}