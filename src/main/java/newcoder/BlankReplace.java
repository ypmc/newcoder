package newcoder;

/**
 * @author kangkang lou
 */
public class BlankReplace {
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        return s.replaceAll("\\s", "%20");

    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("We Are Happy");
        System.out.println(replaceSpace(sb));
    }
}
