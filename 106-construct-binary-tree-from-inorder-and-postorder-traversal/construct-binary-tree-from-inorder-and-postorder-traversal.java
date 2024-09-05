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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0 ||  postorder.length==0){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return func(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    }
    public static TreeNode func(int[] inorder, int[] postorder,int instart,int inend,int poststart,int postend,HashMap<Integer,Integer> map){
        if(instart>inend || poststart>postend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postend]);
        int idx=map.get(root.val);
        int leftele=idx-instart;
        root.left=func(inorder,postorder,instart,idx-1,poststart,poststart+leftele-1,map);
        root.right=func(inorder,postorder,idx+1,inend,poststart+leftele,postend-1,map);
        return root;
    }
}