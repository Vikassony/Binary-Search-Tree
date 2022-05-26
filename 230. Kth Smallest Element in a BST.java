Question Link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    int res = -1;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return -1;
        inOrder(root,k);
        return res;
    }
    public int inOrder(TreeNode root, int k){
        if(root == null) return -1;
        inOrder(root.left,k);
        count++;
        if(count == k){
            res = root.val;
            return res;
        }
        inOrder(root.right,k);
        return -1;
    }
}
