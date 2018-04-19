package leetcode;

/**
 * @author kangkang lou
 */
public class Main_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        } else if (root.left != null) {
            return 1 + minDepth(root.left);
        } else if (root.right != null) {
            return 1 + minDepth(root.right);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

    }
}
