class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum=0;
        double wait=0;
        // sum+=customers[0][0]+customers[0][1];
        // sum-=customers[0][0];
        for(int i=0;i<customers.length;i++){
              if(sum>customers[i][0]){
                sum+=customers[i][1];
              }
              else{
                sum=customers[i][0]+customers[i][1];
              }
              wait+=sum-customers[i][0];
        }
        return wait/customers.length;
    }
}