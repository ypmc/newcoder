package leetcode;

/**
 * @author kangkang lou
 */
public class Main_5_5 {
    public static String addBinary(String a, String b) {
        int x = a.length() - 1;
        int y = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        while (x >= 0 && y >= 0) {
            int m = a.charAt(x) - '0';
            int n = b.charAt(y) - '0';
            sb.append((m + n + temp) % 2);
            temp = (m + n + temp) / 2;
            x--;
            y--;
        }
        if (x >= 0) {
            for (int i = x; i >= 0; i--) {
                int m = a.charAt(i) - '0';
                sb.append((m + temp) % 2);
                temp = (m + temp) / 2;
            }
            if (temp > 0) {
                sb.append(temp);
            }
        } else if (y >= 0) {
            for (int i = y; i >= 0; i--) {
                int m = b.charAt(i) - '0';
                sb.append((m + temp) % 2);
                temp = (m + temp) / 2;
            }
            if (temp > 0) {
                sb.append(temp);
            }
        } else {
            if (temp > 0) {
                sb.append(temp);
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "101";
        String b = "110";
        System.out.println(addBinary(a, b));
    }
}
