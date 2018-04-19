package leetcode;

/**
 * @author kangkang lou
 */
public class Main_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        boolean flag = true;
        flag &= (p.val == q.val) & isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
        return flag;
    }

    public static void main(String[] args) {

    }
}
