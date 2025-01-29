class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        int n=s.length();
        for(int i=1;i<4 && i<n;i++){
            for(int j=i+1;j<i+4 && j<n;j++){
                for(int k=j+1;k<j+4 && k<n;k++){
                    String s1=s.substring(0,i);
                    String s2=s.substring(i,j);
                    String s3=s.substring(j,k);
                    String s4=s.substring(k);
                    if(func(s1) && func(s2) && func(s3) && func(s4)){
                        ans.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return ans;
    }

    public static boolean func(String s){
        if(s.length()>3 || s.length()==0 || Integer.parseInt(s)>255 || (s.length()>1 && s.charAt(0)=='0')){
            return false;
        }
        return true;
    }
}