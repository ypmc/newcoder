package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.left != null) {
            list.addAll(inorderTraversal(root.left));
        }
        list.add(root.val);
        if (root.right != null) {
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
