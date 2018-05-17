package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_234 {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i).intValue() != list.get(list.size() - i - 1).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(-129);
        ListNode b = new ListNode(-129);
        a.next = b;
        System.out.println(isPalindrome(a));
    }
}
