package newcoder;

import java.util.Arrays;

/**
 * @author kangkang lou
 */

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return node;
    }

    public static void preTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        if (node.left != null) {
            preTraversal(node.left);
        }
        if (node.right != null) {
            preTraversal(node.right);
        }
    }

    public static void inTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            inTraversal(node.left);
        }
        System.out.print(node.val + " ");
        if (node.right != null) {
            inTraversal(node.right);
        }
    }

    public static void afterTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            afterTraversal(node.left);
        }
        if (node.right != null) {
            afterTraversal(node.right);
        }
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(pre, in);
        preTraversal(root);
        System.out.println();
        inTraversal(root);
        System.out.println();
        afterTraversal(root);

    }
}
