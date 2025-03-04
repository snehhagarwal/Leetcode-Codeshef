class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            sb.append(ch-'a'+1);
        }
        while(k>0){
            int sum=0;
            for(char c:sb.toString().toCharArray()){
                sum+=c-'0';
            }
            sb=new StringBuilder(String.valueOf(sum));
            k--;
        }
        return Integer.parseInt(sb.toString());
    }
}