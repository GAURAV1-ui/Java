public class sudokoSolver {
    public static void main(String[] args) {
        class Solution {
            public void solveSudoku(char[][] board) {
                solve(board, 0 , 0);
            }
            
            private boolean solve(char[][] board , int i, int j){
                
              if(i == board.length-1 && j == board[0].length-1){
                  return;
              }
                if(j == board[0].length-1){
                    i = i+1;
                    j = 0;
                }
                if(board[i][j] != '.'){
                    continue;
                }
                
                if(board[i][j] == '.'){
                    for(char k = '1' , k <= '9' , k++){
                        board[i][j] = k;
                        if(isValid(board, i , j , k))
                            return true;
                    }
                        board[i][j] = '.';
                }
            }
            
                    private boolean isValid(char[][] board , int i, int j , int k){
                        
                        for(int m = 0 ; m<j ; m++){
                            board[i][j] == k;
                            return false;
                        }
                        for(int m = j+1; m<board[0].length; m++){
                            board[i][j] == k;
                            return false;
                    }
                          for(int m = 0; m< i; m++){
                            board[i][j] == k;
                            return false;
                    }
                         for(int m = i+1; m< board[0].length; m++){
                            board[i][j] == k;
                            return false;
                         }
                        
                        
        }
    }
}
