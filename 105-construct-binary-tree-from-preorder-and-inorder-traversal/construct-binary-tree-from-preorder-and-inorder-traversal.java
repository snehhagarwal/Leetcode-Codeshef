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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0){
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return func(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
    }
    public static TreeNode func(int[] preorder, int[] inorder,int prestart,int preend,int instart,int inend,HashMap<Integer,Integer> map){
           if(prestart>preend || instart>inend){
               return null;
           }
           TreeNode root=new TreeNode(preorder[prestart]);
           int idx=map.get(root.val);
           int leftele=idx-instart;
           root.left=func(preorder,inorder,prestart+1,prestart+leftele,instart,idx-1,map);
           root.right=func(preorder,inorder,prestart+leftele+1,preend,idx+1,inend,map);
           return root;
        }
}