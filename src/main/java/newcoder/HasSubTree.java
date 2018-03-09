package newcoder;

/**
 * @author kangkang lou
 */
public class HasSubTree {
    public static boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (root1.left != null && root2.left != null) {

            }
        }
        return false;
    }
}
