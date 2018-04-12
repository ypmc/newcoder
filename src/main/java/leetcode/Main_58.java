package leetcode;

/**
 * @author kangkang lou
 */
public class Main_58 {
    /**
     * 可以包含其他字符
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        String str = new StringBuilder(s).reverse().toString().toLowerCase();
        String[] arr = str.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            if (!"".equals(arr[i]) && arr[i].replaceAll("[^a-z]", "").length() == arr[i].length()) {
                return arr[i].length();
            }
        }
        return 0;
    }

    public static int lengthOfLastWord0(String s) {
        String str = s.trim();
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord0(s));
    }
}
