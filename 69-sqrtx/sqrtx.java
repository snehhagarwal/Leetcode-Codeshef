class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int a=1;
        int b=x;
        while(a<=b){
            int mid=a+(b-a)/2;
            if((long)mid*mid>(long)x){
                b=mid-1;
            }
            else if(mid*mid==x){
                return mid;
            }else{
                a=mid+1;
            }
        }return b;
    }
}