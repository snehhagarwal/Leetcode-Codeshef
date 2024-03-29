class Solution {
    public String intToRoman(int num) {
        StringBuilder str=new StringBuilder();
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] notation={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        while(num>0){
            while(num>=value[i]){
                str.append(notation[i]);
                num=num-value[i];
            }
            i++;
        }
        return str.toString();
    }
}