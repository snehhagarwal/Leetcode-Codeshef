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
    //-1-->camera need 
    //0-->camera hain
    //1-->camera under
    int c=0;
    public int minCameraCover(TreeNode root) {
        if(func(root)==-1){
            c++;
        }
        return c;
    }

    private int func(TreeNode root){
        if(root==null){
            return 1;
        }
        int left=func(root.left);
        int right=func(root.right);
        if(left==-1 || right==-1){
            c++;
            return 0;
        }
        if(left==0 || right==0){
            return 1;
        }
        return -1;
    }
}