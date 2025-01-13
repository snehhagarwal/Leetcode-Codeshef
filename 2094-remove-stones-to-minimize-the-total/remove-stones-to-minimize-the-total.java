class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        while(k>0){
            int v=pq.poll();
            int p=(int)Math.floor((double)v/(double)2);
            pq.add(v-p);
            k--;
        }
        int sum=0;
        while(pq.size()!=0){
            sum+=pq.poll();
        }
        return sum;
    }
}