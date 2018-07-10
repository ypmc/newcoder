package leetcode;

/**
 * @author kangkang lou
 */
public class Main_405 {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(0x01 & (num >> (31 - i)));
        }
        return Long.toHexString(Long.parseLong(sb.toString(), 2));
    }


    public String toHex0(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }

    public static void main(String[] args) {
        Main_405 main_405 = new Main_405();
        System.out.println(main_405.toHex(26));
        System.out.println(main_405.toHex0(26));
    }
}
