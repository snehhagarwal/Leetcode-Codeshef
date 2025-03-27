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

//formula we usually use is 2^height -1 
//height same of left and right then use formula else add 1 in it and then 
class Solution {
    public int countNodes(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
        // int left=countNodes(root.left);
        // int right=countNodes(root.right);
        // return left+right+1;

        if(root==null){
            return 0;
        }
        int left=hf(root);
        int right=hr(root);
        if(left==right){
            return (int)Math.pow(2,left)-1;
        }
        else return countNodes(root.left)+countNodes(root.right)+1;
    }

    public int hf(TreeNode root){
        int cnt=1;
        while(root.left!=null){
            root=root.left;
            cnt++;
        }
        return cnt;
    }

    public int hr(TreeNode root){
        int cnt=1;
        while(root.right!=null){
            root=root.right;
            cnt++;
        }
        return cnt;
    }
}