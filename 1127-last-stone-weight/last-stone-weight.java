class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int diff=Math.abs(a-b);
            if(diff!=0){
                pq.add(diff);
            }
        }
        if(pq.size()!=0){
            return pq.poll();
        }
        return 0;
    }
}