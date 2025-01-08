class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans=new StringBuilder();
        int c=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 || c==1){
            int sum=c;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            c=sum/2;
            ans.append(sum%2);
        }
        if(c==1){
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}