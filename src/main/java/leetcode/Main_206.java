package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_206 {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode header = null;
        if (!stack.isEmpty()) {
            header = stack.pop();
        }
        ListNode cur = header;
        while (!stack.isEmpty()) {
            cur.next = stack.pop();
            cur = cur.next;
            cur.next = null;
        }
        return header;
    }

    public ListNode reverseList0(ListNode head) {
        ListNode p = null, q, r;
        q = head;
        if (head == null) {
            return head;
        }
        while (q != null) {
            r = q.next;
            q.next = p;
            if (r == null)
                head = q;
            p = q;
            q = r;
        }
        return head;
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
        Main_206 main = new Main_206();
        System.out.println(main.reverseList(a));
    }
}
