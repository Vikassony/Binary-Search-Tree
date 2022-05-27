Question Link : https://leetcode.com/problems/validate-binary-search-tree/

class Solution {
    public boolean isValidBST(TreeNode root) {
        return bst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean bst(TreeNode root,long min, long max){
        if(root == null) return true;
        if(root.val>=max || root.val<=min)
            return false;
        return bst(root.left,min,root.val) && bst(root.right,root.val,max);
    }
}
