class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int a=0;
        boolean b=s.charAt(0) == '-';
        boolean c=s.charAt(0) == '+';
        if(b||c){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i) - '0';
            if (a> Integer.MAX_VALUE / 10 || (a== Integer.MAX_VALUE / 10 && digit>Integer.MAX_VALUE % 10)) {
                return b ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            a=a*10+digit;
            i++;
        }
        return b ? -a : a;
    }
}