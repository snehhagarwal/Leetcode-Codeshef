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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(root,ans,list,targetSum);
        return ans;
    }
    public static void func(TreeNode root,List<List<Integer>> ans,List<Integer> list,int targetSum){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                ans.add(new ArrayList<>(list));
            }
        }
        func(root.left,ans,list,targetSum-root.val);
        func(root.right,ans,list,targetSum-root.val);
        list.remove(list.size()-1);
    }
}