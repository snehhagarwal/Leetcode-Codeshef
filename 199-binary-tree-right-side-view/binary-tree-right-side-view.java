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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        func(root,ans,0);
        return ans;
    }
    public static void func(TreeNode root,List<Integer> ans,int l){
        if(root==null){
            return;
        }
        if(l==ans.size()){
            ans.add(root.val);
        }
        func(root.right,ans,l+1);
        func(root.left,ans,l+1);
    }
}