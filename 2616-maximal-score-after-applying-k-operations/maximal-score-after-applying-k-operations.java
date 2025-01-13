class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(long i:nums){
            pq.add(i);
        }
        long sum=0;
        while(k>0){
            long v=pq.poll();
            sum+=v;
            long a=(int)Math.ceil((double)v/(double)3);
            pq.add(a);
            k--;
        }
        return sum;
    }
}