package huawei;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
 * <p>
 * <p>
 * <p>
 * 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
 * <p>
 * <p>
 * <p>
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 * <p>
 * <p>
 * <p>
 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 */
public class Main_21 {
    static String decode(String str) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('a', "2");
        map.put('b', "2");
        map.put('c', "2");
        map.put('d', "3");
        map.put('e', "3");
        map.put('f', "3");
        map.put('g', "4");
        map.put('h', "4");
        map.put('i', "4");
        map.put('j', "5");
        map.put('k', "5");
        map.put('l', "5");
        map.put('m', "6");
        map.put('n', "6");
        map.put('o', "6");
        map.put('p', "7");
        map.put('q', "7");
        map.put('r', "7");
        map.put('s', "7");
        map.put('t', "8");
        map.put('u', "8");
        map.put('v', "8");
        map.put('w', "9");
        map.put('x', "9");
        map.put('y', "9");
        map.put('z', "9");
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append(map.get(c));
            } else if (c >= 'A' && c <= 'Z') {
                char temp = (char) ((c - 'A' + 1) % 26 + 97);
                sb.append(temp);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(decode(in.next()));
        }
    }
}
