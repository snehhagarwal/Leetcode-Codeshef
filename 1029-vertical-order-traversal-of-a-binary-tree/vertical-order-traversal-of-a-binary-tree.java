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
    class Tuple{
        TreeNode n;
        int vertical;
        int level;
        public Tuple(TreeNode nn,int v,int l){
            n=nn;
            vertical=v;
            level=l;
        }
    }
    public  List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> qu=new LinkedList<>();
        qu.offer(new Tuple(root,0,0));
        while(!qu.isEmpty()){
            Tuple t=qu.poll();
            TreeNode nq=t.n;
            int v=t.vertical;
            int l=t.level;
            if(!map.containsKey(v)){
                map.put(v,new TreeMap<>());
            }
            if(!map.get(v).containsKey(l)){
                map.get(v).put(l,new PriorityQueue<>());
            }
            map.get(v).get(l).offer(nq.val);
            if(nq.left!=null){
                qu.offer(new Tuple(nq.left,v-1,l+1));
            }
            if(nq.right!=null){
                qu.offer(new Tuple(nq.right,v+1,l+1));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> it:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:it.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
}
 