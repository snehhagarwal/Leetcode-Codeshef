class Solution {
    public int nthUglyNumber(int n) {
        int[] arr={2,3,5};
        PriorityQueue<Long> pq=new PriorityQueue<>();
        HashSet<Long> set=new HashSet<>();
        pq.add(1L);
        set.add(1L);
        long temp=0;
        while(n-->0){
            temp=pq.poll();
            for(int i:arr){
                if(!set.contains(temp*i)){
                    pq.add(temp*i);
                    set.add(temp*i);
                }
            }
        }
        return (int)temp;
    }
}