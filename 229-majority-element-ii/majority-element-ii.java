class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int ele1=0;
        int cnt2=0;
        int ele2=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1) cnt1++;
            else if (nums[i]==ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        int freq1=0; 
        int freq2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                freq1++;
            }
            else if(nums[i]==ele2){
                freq2++;
            }
        }
        if(freq1>nums.length/3){
            ans.add(ele1);
        }
        if(freq2>nums.length/3){
            ans.add(ele2);
        }
        return ans;
    }
}