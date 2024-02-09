import java.util.*;
class Solution {
    public static List < List < String >> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] list=new char[n][n];
        print(list,result,0);
        return result;
    }
    public static void print(char[][] list,List<List<String>> result,int col){
        if(col==list.length){
            addrow(list,result);
            return;
        }
        for(int row=0;row<list.length;row++){
            if(issafe(row,col,list)){
                list[row][col]='Q';
                print(list,result,col+1);
                list[row][col]='.';
            }
        }
    }
    public static boolean issafe(int row,int col,char[][] list){
        //horizontal
        for(int i=0;i<list.length;i++){
            if(list[row][i]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<list[0].length;i++){
            if(list[i][col]=='Q'){
                return false;
            }        
        }
        //upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(list[r][c]=='Q'){
                return false;
            }
        }
        //upper right
        r=row;
        for(int c=col;c<list.length && r>=0;c++,r--){
               if(list[r][c]=='Q'){
                   return false;
               }
        }
        //down right
        r=row;
        for(int c=col;c<list.length && r<list[0].length;r++,c++){
            if(list[r][c]=='Q'){
                return false;
            }
        }
        //down left
        r=row;
        for(int c=col;c>=0 && r<list.length;r++,c--){
            if(list[r][c]=='Q'){
                return false;
            }
        }
        return true;
        }

        public static void addrow(char[][] list,List<List<String>> result){
            String row="";
            List<String> filledrow=new ArrayList<>();
            for(int i=0;i<list.length;i++){
                row="";
                for(int j=0;j<list[0].length;j++){
                    if(list[i][j]=='Q'){
                        row+="Q";
                    }
                    else{
                        row+=".";
                    }
                }
                filledrow.add(row);
            }
            result.add(filledrow);
        }
    }
