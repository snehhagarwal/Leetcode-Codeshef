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
    int moves=0;
    public int distributeCoins(TreeNode root) {
        func(root);
        return moves;
    }
    public int func(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=func(root.left);
        int right=func(root.right);
        int c=left+right+root.val-1;
        moves+=Math.abs(c);
        return c;
    }
}