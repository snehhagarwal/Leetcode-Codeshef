class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        int cnt=0;
        for(int i:map.values()){
            if(i==max){
                cnt++;
            }
        }
        return cnt*max;
    }
}