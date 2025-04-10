package learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
problem 101
https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return mirror(root.left, root.right);
    }
    private boolean mirror(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val){
            return false;
        }
        return mirror(left.left, right.right) && mirror(left.right, right.left);
    }

}
