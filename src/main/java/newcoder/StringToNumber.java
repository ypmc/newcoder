package newcoder;

/**
 * @author kangkang lou
 */

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class StringToNumber {
    public int StrToInt(String str) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum * 10 + (c - '0');
            } else if (c == '+') {
                flag = false;
            } else if (c == '-') {
                flag = true;
            } else {
                sum = 0;
                break;
            }

        }
        return flag ? 0 - sum : sum;
    }
}
