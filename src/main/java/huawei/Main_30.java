package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 对字符串中的所有单词进行倒排。
 * <p>
 * 说明：
 * <p>
 * 1、每个单词是以26个大写或小写英文字母构成；
 * <p>
 * 2、非构成单词的字符均视为单词间隔符；
 * <p>
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * <p>
 * 4、每个单词最长20个字母；对字符串中的所有单词进行倒排。
 * <p>
 * 说明：
 * <p>
 * 1、每个单词是以26个大写或小写英文字母构成；
 * <p>
 * 2、非构成单词的字符均视为单词间隔符；
 * <p>
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * <p>
 * 4、每个单词最长20个字母；
 */
public class Main_30 {
    static String reverseOrder(String str) {
        String[] arr = str.split("[^a-zA-Z]+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(reverseOrder(str));
        }
    }
}
