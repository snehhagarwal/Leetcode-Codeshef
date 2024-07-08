class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=print(nums,goal)-print(nums,goal-1);
        return ans;
    }
    public static int print(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int i=0;
        int j=0;
        int sum=0;
        int cnt=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            cnt+=(j-i+1);
            j++;
        }
        return cnt;
    }
}


 // int cnt=0;
        // int sum=0;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(0,1);//imp 
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(map.containsKey(sum-goal)){
        //         cnt+=map.get(sum-goal);
        //     }
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // return cnt;