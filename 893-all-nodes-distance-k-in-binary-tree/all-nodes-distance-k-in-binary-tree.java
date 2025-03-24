/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        func(root,parent);
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        visited.put(target,true);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        int dist=0;
        while(!q.isEmpty()){
            int s=q.size();
            if(dist==k){
                break;
            }
            dist++;
            for(int i=0;i<s;i++){
                 TreeNode cur=q.poll();
                 if(cur.left!=null && visited.get(cur.left)==null){
                    q.offer(cur.left);
                    visited.put(cur.left,true);
                 }
                 if(cur.right!=null && visited.get(cur.right)==null){
                    q.offer(cur.right);
                    visited.put(cur.right,true);
                }
                if(parent.get(cur)!=null && visited.get(parent.get(cur))==null){
                    q.offer(parent.get(cur));
                    visited.put(parent.get(cur),true);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }

    public void func(TreeNode root,HashMap<TreeNode,TreeNode> parent){
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            TreeNode curr=qu.poll();
            if(curr.left!=null){
                qu.offer(curr.left);
                parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                qu.offer(curr.right);
                parent.put(curr.right,curr);
            }
        }
    }
}