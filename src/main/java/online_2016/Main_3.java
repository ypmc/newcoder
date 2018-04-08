package online_2016;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            List<Integer> fib = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
            //拆分字符串
            Set<String> subStr = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    subStr.add(str.substring(i, j + 1));
                }
            }
            //对子字符串集合进行排序
            ArrayList<String> strList = new ArrayList<String>();
            strList.addAll(subStr);
            Collections.sort(strList);
            //比对并输出
            Set<Character> chs = new HashSet<>();
            for (String s : strList) {
                char[] ch = s.toCharArray();
                for (char c : ch) {
                    chs.add(c);
                }
                if (fib.contains(chs.size())) {
                    System.out.println(s);
                }
                chs.clear();
            }

        }
    }
}
