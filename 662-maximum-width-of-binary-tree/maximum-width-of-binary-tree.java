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
class Pair{
    TreeNode node;
    int val;
    public Pair(TreeNode node,int val){
        this.node=node;
        this.val=val;
    }
} 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
         q.offer(new Pair(root,0));
         while(!q.isEmpty()){
            int size=q.size();
            int minval=q.peek().val;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                int idx=q.peek().val-minval;
                TreeNode n=q.peek().node;
                q.poll();
                if(i==0){
                    first=idx;
                }
                if(i==size-1){
                    last=idx;
                }
                if(n.left!=null){
                    q.offer(new Pair(n.left,idx*2+1));
                }
                if(n.right!=null){
                    q.offer(new Pair(n.right,idx*2+2));
                }
            }
            ans=Math.max(ans,(last-first+1));
        }
        return ans;
    }
}