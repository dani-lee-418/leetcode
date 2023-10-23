package week5;

import collections.TreeNode;

public class SameTree_100 {

    public static void main(String[] args) {
        TreeNode tree2 = new TreeNode(3);
        TreeNode tree3 = new TreeNode(3);
        TreeNode p = new TreeNode(1, tree2, tree3);
        TreeNode q = new TreeNode(1, tree2, tree3);
        SameTree_100 s = new SameTree_100();
        System.out.println(s.isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //value비교
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || (p.val != q.val)) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        //right비교

    }

}
