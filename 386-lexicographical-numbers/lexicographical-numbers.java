class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> a=new ArrayList<>();
        number(n,1,a);
        return a;
    }
    public void number(int n,int b,List<Integer> a){
        if(b>n){
            return;
        }
        a.add(b);
        number(n,b*10,a);
        if(b%10!=9){
            number(n,b+1,a);
        }
    }
}