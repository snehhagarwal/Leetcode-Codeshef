import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        ArrayList<BigInteger> arr=new ArrayList<>();
        for(String str:nums){
            arr.add(new BigInteger(str));
        }
        Collections.sort(arr);
        return arr.get(arr.size()-k).toString();
    }
}