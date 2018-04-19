package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_92 {
    //1,2,3,4,5
    //1,4,3,2,5
    //m = 2, n = 4
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        ListNode header = head;
        ListNode pre = head;
        ListNode next;
        int index = 1;
        while (index < m) {
            pre = cur;
            cur = cur.next;
            index++;
        }
        while (index < n) {
            stack.push(cur);
            cur = cur.next;
            index++;
        }
        stack.push(cur);

        next = cur.next;
        ListNode temp = stack.pop();
        if (m == 1) {
            header = temp;
        }else {
            pre.next = temp;
        }
        while (!stack.empty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = next;
        return header;
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
        System.out.println(reverseBetween(d, 1, 2));
    }
}
