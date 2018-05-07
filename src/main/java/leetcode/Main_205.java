package leetcode;

/**
 * @author kangkang lou
 */
public class Main_205 {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (value(i, s) != value(i, t)) {
                return false;
            }
        }
        return true;
    }

    private int value(int pos, String source) {
        char c = source.charAt(pos);
        int index = source.indexOf(c);
        if (index < pos) return index;
        return pos;
    }

}
