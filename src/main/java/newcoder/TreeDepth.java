package newcoder;

/**
 * @author kangkang lou
 */

/**
 * 计算树的深度
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }

    public static void main(String[] args) {

    }
}
