class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(long i:gifts){
            pq.add(i);
        }
        long sum=0;
        while(k-->0){
            long t=pq.poll();
            pq.add((long)Math.sqrt(t));
        }
        for(long q:pq){
            sum+=q;
        }
        return sum;
    }
}