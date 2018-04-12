package leetcode;

/**
 * @author kangkang lou
 * 交换链表中的节点
 */
public class Main_24 {

    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        ListNode header = head.next;
        head.next = swapPairs(head.next.next);
        header.next = head;
        return header;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(new Main_24().swapPairs(a));
    }
}
