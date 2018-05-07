package leetcode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
public class Main_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        getRightMostView(root, result);
        return result;
    }

    private void getRightMostView(TreeNode cur, List<Integer> result) {
        result.add(cur.val);
        Queue<TreeNode> queue = new LinkedList<>();
        if (cur.left != null) {
            queue.add(cur.left);
        }
        if (cur.right != null) {
            queue.add(cur.right);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (i == size) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
