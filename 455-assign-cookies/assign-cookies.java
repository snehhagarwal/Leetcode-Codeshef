class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;//for g
        int j=0;//for s
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}