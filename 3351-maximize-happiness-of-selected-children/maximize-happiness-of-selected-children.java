class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=happiness[happiness.length-1];
        k--;
        int count=1;
        for(int i=happiness.length-2;i>=0;i--){
            if(k>0){
                if(happiness[i]-count<=0){
                    ans+=0;
                    break;
                }
                else{
                    ans+=happiness[i]-count;
                    count++;
                    k--;
                }
            }
        }
        return ans;
    }
}