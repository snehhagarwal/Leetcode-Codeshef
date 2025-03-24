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
    int count=0;
    public int goodNodes(TreeNode root) {
        func(root,root.val);
        return count;
    }

    public void func(TreeNode root,int val){
        if(root==null){
            return;
        }
        if(root.val>=val){
            count++;
            val=root.val;
        }
        func(root.left,val);
        func(root.right,val);
    }
}