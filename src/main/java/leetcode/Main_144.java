package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            list.add(t.val);
            if (t.right != null) {
                stack.push(t.right);
            }
            if (t.left != null) {
                stack.push(t.left);
            }
        }
        return list;

    }

    public static void main(String[] args) {

    }
}
