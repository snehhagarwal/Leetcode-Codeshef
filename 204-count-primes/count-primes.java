class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean[] prime=new boolean[n];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<prime.length;i++){
            if(prime[i]==false){
            for(int j=2;i*j<prime.length;j++){
                prime[i*j]=true;
            }
        }
        }
        int count=0;
        for(int i=0;i<prime.length;i++){
            if(prime[i]==false){
                count++;
            }
        }
        return count;
    }
}


