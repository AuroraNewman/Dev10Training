package learn;
/*
problem 100
from https://leetcode.com/problems/same-tree/description/
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return  true;
        } else if (p == null || q == null || p.val != q.val){
            return false;
        }
        boolean leftMatch = isSameTree(p.left, q.left);
        boolean rightMatch = isSameTree(p.right, q.right);
        return (leftMatch && rightMatch);
    }
}
