package newcoder;

import java.util.Stack;

/**
 * @author kangkang lou
 */

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode header = null;
        ListNode temp = null;
        while (!stack.empty()) {
            ListNode t = stack.pop();
            if (header == null) {
                header = t;
                temp = header;
            } else {
                temp.next = t;
                temp = temp.next;
                temp.next = null;
            }

        }
        return header;
    }

    public static void main(String[] args) {
        ListNode t0 = new ListNode(1);
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(3);
        ListNode t3 = new ListNode(4);
        ListNode t4 = new ListNode(5);
        t0.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = null;

        ListNode t = reverseList(t0);
        while (t != null) {
            System.out.println(t.val);
            t = t.next;
        }
    }
}
