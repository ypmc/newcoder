package leetcode;

/**
 * @author kangkang lou
 */

/**
 * 合并链表
 */
public class Main_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = null;
        ListNode cur = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (header == null) {
                    header = l1;
                    cur = header;
                } else {
                    cur.next = l1;
                    cur = cur.next;
                }
                l1 = l1.next;
            } else {
                if (header == null) {
                    header = l2;
                    cur = header;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                }
                l2 = l2.next;
            }
        }
        if (header == null) {
            if (l1 != null) {
                return l1;
            } else if (l2 != null) {
                return l2;
            } else {
                return null;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return header;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(mergeTwoLists(a, d));
    }
}
