package leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author kangkang lou
 */
public class Main_2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        while (l1 != null) {
            a.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            b.append(l2.val);
            l2 = l2.next;
        }

        BigDecimal x = new BigDecimal(a.reverse().toString());
        BigDecimal y = new BigDecimal(b.reverse().toString());
        BigDecimal z = x.add(y);
        if (z.equals("0")) {
            return new ListNode(0);
        }
        ArrayList<Integer> list = new ArrayList<>();
        String s = z.toString();
        for (int i = s.length() - 1; i >= 0; i--) {
            list.add(s.charAt(i) - '0');
        }

        ListNode root = new ListNode(list.get(0));
        ListNode cur = root;
        for (int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            cur.next = node;
            cur = node;
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode x = new ListNode(5);
        ListNode y = new ListNode(6);
        ListNode z = new ListNode(4);
        a.next = b;
        b.next = c;

        x.next = y;
        y.next = z;

        new Main_2().addTwoNumbers(a, x);
    }
}
