class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rightsum=0;
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        int max=leftsum;
        int idx=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[idx];
            idx--;
            max=Math.max(max,leftsum+rightsum);
        }
        return max;
    }
}