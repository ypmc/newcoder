package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s.length() == 0) {
            return res;
        }
        recur(res, new ArrayList<>(), s);
        return res;
    }

    public void recur(List<List<String>> res, List<String> temp, String s) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalin(s.substring(0, i + 1))) {
                temp.add(s.substring(0, i + 1));
                recur(res, temp, s.substring(i + 1));
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalin(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
