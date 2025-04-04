class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area=0;
        while(start<=end){
            int newarea=(end-start)*Math.min(height[start],height[end]);
            area=Math.max(area,newarea);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }return area;
    }
}