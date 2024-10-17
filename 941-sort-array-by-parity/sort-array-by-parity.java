class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        ArrayList<Integer> ans=new ArrayList<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[a]=nums[i];
                a++;
            }else{
                ans.add(nums[i]);
            }
        }
        int k=0;
        for(int i=a;i<nums.length;i++){
            arr[i]=ans.get(k);
            k++;
        }
        return arr;
    }
}