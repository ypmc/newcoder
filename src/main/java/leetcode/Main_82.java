package leetcode;

/**
 * @author kangkang lou
 */
public class Main_82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0 == head.val ? 1 : 0); // to guarantee the dummy node is not same as the original head.
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode first = dummy;  // the first node in the new unduplicated(result) list.
        while (cur != null && cur.next != null) {
            if (cur.val != pre.val && cur.val != cur.next.val) { // we found a unique node, we connect it at the tail of the unduplicated list, and update the first node.
                first.next = cur;
                first = first.next;
            }
            pre = cur;
            cur = cur.next;
        }
        if (pre.val != cur.val) { // the last node needs to be dealt with independently
            first.next = cur;
            first = first.next;
        }
        first.next = null; // the subsequent list is duplicate.
        return dummy.next;
    }
    
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(2);

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode header = deleteDuplicates(a);
        System.out.println(header);
    }
}
