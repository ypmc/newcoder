package newcoder;

/**
 * @author kangkang lou
 */


/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class IsNumber {

    public static boolean isNumeric(char[] str) {
        String s = new String(str);
        boolean result = true;
        if (str[0] == '+' || str[0] == '-') {
            s = s.substring(1);
        }
        if (s.startsWith("+") || s.startsWith("-")) {
            return false;
        }
        if (s.contains("e") || s.contains("E")) {
            int pos = -1;
            if (s.contains("e")) {
                pos = s.indexOf("e");
            }
            if (s.contains("E")) {
                pos = s.indexOf("E");
            }
            String a_str = s.substring(pos + 1);
            String b_str = s.substring(0, pos);
            try {
                Float.parseFloat(b_str);
                Integer.parseInt(a_str);
            } catch (Exception e) {
                result = false;
            }
        } else {
            try {
                Float.parseFloat(s);
            } catch (Exception e) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("5e2".toCharArray()));
    }
}
