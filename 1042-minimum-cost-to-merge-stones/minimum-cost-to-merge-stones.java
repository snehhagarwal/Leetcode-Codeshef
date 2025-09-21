class Solution {
    public int mergeStones(int[] stones, int k) {
        int l=stones.length;
        if((l-1)%(k-1)!=0){
            return -1;
        }
        int[][] dp=new int[l][l];
        int[] prefixsum=new int[l+1];
        for(int i=0;i<stones.length;i++){
            prefixsum[i+1]=prefixsum[i]+stones[i];
        }
        for(int s=k;s<=l;s++){
            for(int i=0;i+s<=l;i++){
                int j=i+s-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int m=i;m<j;m+=k-1){
                    dp[i][j]=Math.min(dp[i][j],dp[i][m]+dp[m+1][j]);
                }
                if((s-1)%(k-1)==0){
                    dp[i][j]+=prefixsum[j+1]-prefixsum[i];
                }
            }
        }
        return dp[0][l-1];
    }
}