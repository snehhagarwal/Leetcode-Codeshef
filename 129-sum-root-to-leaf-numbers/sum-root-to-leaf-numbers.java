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
    public int sumNumbers(TreeNode root) {
        int result=func(root,0);
        return result;
    }
    public static int func(TreeNode root,int ans){
        if(root==null){
            return 0;
        }
        ans=(ans*10)+root.val;
        if(root.left==null && root.right==null){//checks if is is leaf node last one 
            return ans;
        }
        int l1=func(root.left,ans);
        int l2=func(root.right,ans);
        return l1+l2;
    }
}
