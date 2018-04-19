package leetcode;

/**
 * @author kangkang lou
 */
public class Main_71 {
    public static String simplifyPath(String path) {
        if ("/".equals(path)) {
            return path;
        }
        path = path.replaceAll("//", "/");
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        if (path.contains("../")) {
            path = path.substring(path.lastIndexOf("../") + 2);
        }
        return path;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}
