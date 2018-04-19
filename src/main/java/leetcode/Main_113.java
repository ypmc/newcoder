package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        if (!hasPathSum(root, sum)) {
            return list;
        } else {
            traversal(root, sum, new Stack<>(), list);
        }
        return list;
    }

    void traversal(TreeNode root, int sum, Stack<Integer> l, List<List<Integer>> list) {

        l.push(root.val);
        if (root.left == null && root.right == null) {
            list.add(new ArrayList<>(l));
        }
        if (hasPathSum(root.left, sum - root.val)) {
            traversal(root.left, sum - root.val, l, list);
        }
        if (hasPathSum(root.right, sum - root.val)) {
            traversal(root.right, sum - root.val, l, list);
        }
        l.pop();
    }

    private boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {

    }
}
