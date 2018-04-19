package leetcode;

/**
 * @author kangkang lou
 */
public class Main_115 {
    public void connect(TreeLinkNode root) {
        TreeLinkNode start = root;
        while (start != null) {
            TreeLinkNode cur = start;
            while (cur != null) {
                if (cur.left != null) cur.left.next = cur.right;
                if (cur.right != null && cur.next != null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            start = start.left;
        }
    }

    public static void main(String[] args) {

    }
}
