package leetcode;

/**
 * @author kangkang lou
 */
public class Main_38 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        char pre = s.charAt(0);
        int index = 1;
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != pre) {
                sb.append(index);
                sb.append(pre);
                pre = cur;
                index = 1;
            } else {
                index++;
                pre = cur;
            }
        }
        sb.append(index);
        sb.append(pre);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));

    }
}
