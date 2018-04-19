package leetcode;

/**
 * @author kangkang lou
 */
public class Main_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        int pos = len % 2 == 1 ? (len - 1) / 2 : len / 2;
        cur = head;
        int index = 0;
        ListNode pre = head;
        while (index < pos) {
            pre = cur;
            cur = cur.next;
            index++;
        }
        TreeNode root = new TreeNode(cur.val);
        pre.next=null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(cur.next);
        return root;
    }

    public static void main(String[] args) {

    }
}
