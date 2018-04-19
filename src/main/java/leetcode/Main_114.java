package leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
public class Main_114 {
    Queue<TreeNode> queue = new LinkedBlockingQueue<>();

    public void flatten(TreeNode root) {
        preorder(root);
        TreeNode pre;
        TreeNode cur;
        pre = queue.poll();
        if (pre == null) {
            return;
        }
        while (!queue.isEmpty()) {
            cur = queue.poll();
            pre.right = cur;
            pre.left = null;
            pre = cur;
        }
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        queue.add(root);
        preorder(root.left);
        preorder(root.right);
    }


    private TreeNode prev = null;

    public void flatten0(TreeNode root) {
        if (root == null)
            return;
        flatten0(root.right);
        flatten0(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    public static void main(String[] args) {

    }
}
