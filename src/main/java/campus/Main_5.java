package campus;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int index = 0;
        int i = 0;
        char[] s = str.toCharArray();
        while (s[i] == '?') {
            i++;
            if (i == str.length()) {
                break;
            }
        }
        i++;
        for (; i < str.length(); ++i) {
            if (s[i] == '?') {
                //若为'?',则根据前一个字母设置'?'为不同的一个字母
                if (s[i - 1] == 'A') {
                    s[i] = 'B';
                } else {
                    s[i] = 'A';
                }
            } else {
                //若不为'?'，且与前一个字母相同，++res
                if (s[i - 1] == s[i]) {
                    ++index;
                }
            }
        }
        System.out.println(index);
    }
}
