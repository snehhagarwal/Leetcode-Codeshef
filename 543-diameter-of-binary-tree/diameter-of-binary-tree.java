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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int leftsub=height(root.left);
        int rightsub=height(root.right);
        int sd=leftsub+rightsub;
        return Math.max(sd,Math.max(left,right));
    }
    public static int height(TreeNode nn){
        if(nn==null){
            return 0;
        }
        int lh=height(nn.left);
        int rh=height(nn.right);
        return Math.max(lh,rh)+1;
    }
}