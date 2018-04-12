package leetcode;

/**
 * @author kangkang lou
 */
public class Main_19 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first;
        ListNode second;
        ListNode pre;
        first = head;
        second = head;
        pre = second;
        int index = 0;
        while (index < n) {
            first = first.next;
            index++;
        }
        while (first != null) {
            pre = second;
            second = second.next;
            first = first.next;
            index++;
        }
        //删除节点
        pre.next = second.next;
        //只有一个节点
        if (index == 1) {
            return null;
        } else if (head == second) {
            //删除的是头节点
            return head.next;
        } else {
            //删除的是非头节点
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode header = removeNthFromEnd(a, 1);
        System.out.println(header);
    }

}
