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
    int ans=0;
    public int sumRootToLeaf(TreeNode root) {
        func(root,0);
        return ans;
    }
    public void func(TreeNode root,int sum){//static nahi likhna hain yaha pr 
        if(root==null){
            return;
        }
        sum=sum*2+root.val;
        if(root.left==null && root.right==null){
            ans=ans+sum;
        }      
        func(root.left,sum);  
        func(root.right,sum);
    }
}