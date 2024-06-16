class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int no=nums[i];
            int required=target-no;
            if(map.containsKey(required)){
                arr[0]=map.get(required);
                arr[1]=i;
                return arr;
            }
            map.put(no,i);
        }
        return arr;
    }
}