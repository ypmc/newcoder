package online;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 二叉树高度
 */
public class Main_2 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(treeDepth(root.left), treeDepth(root.right));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, TreeNode> map = new HashMap<>();
        TreeNode rNode = null;
        while (in.hasNext()) {
            int num = in.nextInt();
            for (int i = 0; i < (num - 1); i++) {
                int rootV, nodeV;
                rootV = in.nextInt();
                nodeV = in.nextInt();

                TreeNode rootNode = map.getOrDefault(rootV, new TreeNode(rootV));
                TreeNode childNode = map.getOrDefault(nodeV, new TreeNode(nodeV));

                if (rootNode.left == null) {
                    //左节点是否为空
                    rootNode.left = childNode;
                } else if (rootNode.right == null) {
                    //右节点是否为空
                    rootNode.right = childNode;
                }
                map.put(rootV, rootNode);
                map.put(nodeV, childNode);

                if (i == 0) {
                    rNode = rootNode;
                }
            }
            System.out.println(treeDepth(rNode));
        }
    }
}
