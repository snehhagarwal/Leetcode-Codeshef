class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=print(nums,k)-print(nums,k-1);
        return ans;
    }
    public static int print(int[] nums, int k){
        int i=0;
        int j=0;
        int sum=0;
        int cnt=0;
        while(j<nums.length){
            sum+=(nums[j]%2);
            while(sum>k){
                sum-=(nums[i]%2);
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}