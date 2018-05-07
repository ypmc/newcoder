package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */
class WordDictionary {

    private List<String> list;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        list = new ArrayList<>();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        list.add(word);
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (".".equals(word)) {
            for (String s : list) {
                if (s.length() == 1) {
                    return true;
                }
            }
            return false;
        } else {
            Pattern p = Pattern.compile(word);
            Matcher m;
            for (String s : list) {
                if (s.length() == word.length()) {
                    m = p.matcher(s);
                    if (m.find()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
            return false;
        }

    }
}

public class Main_211 {
    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("a");
        obj.addWord("a");
        System.out.println(obj.search(".a"));
        System.out.println(obj.search("a."));
    }
}
