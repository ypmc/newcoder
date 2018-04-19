package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        if (maxWidth <= 1) {
            for (String s : words) {
                list.add(s);
            }
            return list;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            if (sb.toString().length() + s.length() <= maxWidth) {
                sb.append(s);
                sb.append(" ");
            } else {
                list.add(format(sb.toString().trim(), maxWidth));
                sb.delete(0, sb.toString().length());
                sb.append(s);
                sb.append(" ");
            }
        }
        if (sb.toString().length() > 0) {
            list.add(sb.toString().trim());
        }
        String t = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        list.add(rightPadding(t, maxWidth));
        return list;
    }

    String rightPadding(String str, int width) {
        if (str.length() >= width) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int len = sb.toString().length();
        for (int i = 0; i < width - len; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    String format(String s, int width) {
        if (!s.trim().contains(" ")) {
            return rightPadding(s, width);
        }
        int step = s.length() - s.replaceAll(" ", "").length();
        int total = width - s.replaceAll(" ", "").length();
        step = step == 0 ? 1 : step;
        int b = total % step;
        int a = total / step;

        String[] strings = s.split(" ");
        String[] padding = new String[step];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < padding.length; i++) {
            padding[i] = sb.toString();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b; i++) {
            padding[i] += " ";
        }

        for (int i = 0; i < padding.length; i++) {
            result.append(strings[i]);
            result.append(padding[i]);
        }
        result.append(strings[strings.length - 1]);
        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> list = new Main_68().fullJustify(words, 16);
        for (String s : list) {
            System.out.println("[" + s + "]");
        }
    }
}
