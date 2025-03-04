import java.util.*;
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        long left=0;
        long right=10000007;
        long ans=-1;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(canReach(dist,hour,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return (int)ans;
    }
    public static  boolean canReach(int[] dist,double hour,long speed){
        double time=0;
        for(int i=0;i<dist.length-1;i++){
            time+=Math.ceil((double)dist[i]/speed);
        }
        time+=(double)dist[dist.length-1]/speed;
        return time<=hour;
    }
}