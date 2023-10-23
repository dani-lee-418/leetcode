package week5;

import collections.TreeNode;

public class InvertBinaryTree_266 {

    public static void main(String[] args) {
        InvertBinaryTree_266 a = new InvertBinaryTree_266();
//        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(2), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        a.invertTree(root);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        } else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }


}
