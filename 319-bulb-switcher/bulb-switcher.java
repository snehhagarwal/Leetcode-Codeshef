class Solution {
    public int bulbSwitch(int n) {
        //only the bulbs on a perfect square will be on 
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            cnt++;
        }
        return cnt;
    }
}