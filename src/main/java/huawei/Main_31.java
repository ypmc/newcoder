package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 * <p>
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 * manacher算法
 */
public class Main_31 {
    public static int manacher(String s) {
        int count = 0;
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        sb.append("#");
        //对字符串进行封装
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
            sb.append("#");
        }
        int[] rad = new int[sb.length()];//记录新字符串以每个字符为中心的最大回文半径
        char[] cl = sb.toString().toCharArray();
        int max = 0;//记录已经搜寻到的回文半径能到达右端的最达大值
        int id = 0;//记录回文半径能到达最有端的回文字符串的中心
        for (int i = 1; i < cl.length; i++) {
            if (max > i) {
                rad[i] = Math.min(rad[2 * id - i], max - i);
            } else {
                rad[i] = 1;
            }
            while (i - rad[i] >= 0 && i + rad[i] < cl.length && cl[(i - rad[i])] == cl[(i + rad[i])]) {
                rad[i]++;
            }
            if (i + rad[i] > max) {
                max = i + rad[i];
                id = i;
            }
            count = Math.max(count, rad[i] - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            System.out.println(manacher(s));
        }
    }

}
