class Solution {
    public void solveSudoku(char[][] board) {
        solver(board,0,0);
    }
    public static boolean solver(char[][] board,int row,int col){
        if(col==board[0].length){
            return solver(board,row+1,0);
        }
        if(row==board.length){
               return true;
        }
        if(board[row][col]!='.'){
           return solver(board,row,col+1);
        }
            for(char i='1';i<='9';i++){
                if(check(board,row,col,i)){
                    board[row][col]=i;
                    if(solver(board,row,col+1)){
                      return true;
                    }else{
                        board[row][col]='.';
                    }
        }
    }
    return false;
    }
    public static boolean check(char[][] board,int row,int col,int val){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[i][col]==val){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int r=row-row%sqrt;
        int c=col-col%sqrt;
        for(int i=r;i<r+sqrt;i++){
            for(int j=c;j<c+sqrt;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
}
