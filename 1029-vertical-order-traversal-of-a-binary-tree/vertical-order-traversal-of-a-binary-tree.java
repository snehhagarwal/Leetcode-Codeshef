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
    
    class Pair{
        int height;
        int val;

        public Pair(int h, int v){
            height = h;
            val = v;
        }
    }

    // rather than using a TreeMap that keeps the entities sorted based on key, 
    // we use these variables to iterate over the map and keep our ans List sorted
    // TreeMap would has a complexity of O(log n) for all operation and
    // hence it would increase the complexity of retreival and addition to the TreeMap.
    // Here we can use this as we have given constraint that "The number of nodes in the tree is in the range [1, 1000]."
    private int min = Integer.MAX_VALUE; // since int is primitive it needs to be og global scope, else it will be overwritten in every function scope
    private int max = Integer.MIN_VALUE;

    private void traverse( TreeNode root, int col, Map<Integer, List<Pair>> map,int height){

        if(root == null) return;

        if(map.get(col) == null ) map.put(col, new ArrayList<Pair>());   

        map.get(col).add(new Pair(height,root.val));


        min  = Math.min(min,col);
        max  = Math.max(max,col);
        

        traverse(root.left, col-1,map,height+1);
        traverse(root.right, col+1,map,height+1);

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Map<Integer,List<Pair>> map = new HashMap<>();

        traverse(root, 0, map,0);

        List<List<Integer>> ans = new ArrayList<>();

        for(int col = min; col <= max; col++){

            List<Pair> temp = map.get(col);

            if(temp != null){
            // if same height sort based on value
            // else based on height
             Collections.sort(temp, (p1, p2) -> {
                    if (p1.height == p2.height) {
                        return p1.val - p2.val;
                    }
                    return p1.height - p2.height;
                });


                List<Integer> pans= new ArrayList<>();
                for( Pair p : temp){
                    pans.add(p.val);
                }

                ans.add(pans);
            }
        }
        return ans;
    }
}