package leetcode;

/**
 * @author kangkang lou
 */
public class Main_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            return removeElements(head.next, val);
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }
            pre = cur;
            cur = cur.next;
            if (cur == null && pre.val == val) {
                pre = null;
            }
        }
        return head;
    }
}
