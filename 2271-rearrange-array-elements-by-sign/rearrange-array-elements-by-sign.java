class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }  
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        } 
        return arr;
     }

}