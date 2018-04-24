package leetcode;

/**
 * @author kangkang lou
 */
public class Main_165 {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : arr1) {
            sb1.append(autoGenericCode(s, 5));
        }
        for (String s : arr2) {
            sb2.append(autoGenericCode(s, 5));
        }
        int len1 = sb1.toString().length();
        int len2 = sb2.toString().length();
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                sb2.append("0");
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                sb1.append("0");
            }
        }
        int result = sb1.toString().compareTo(sb2.toString());
        return result > 0 ? 1 : result < 0 ? -1 : 0;
    }

    private String autoGenericCode(String code, int num) {
        return String.format("%0" + num + "d", Integer.parseInt(code.replaceAll("[^0-9]", "")));
    }

    public static void main(String[] args) {
        String s1 = "1.0";
        String s2 = "1";
        System.out.println(new Main_165().compareVersion(s1, s2));
    }
}
