
public class nQueens {
    public static void queens(boolean[][] board, int r) {
        if(r == board.length){
            display(board);
            System.out.println();
            return;
            
        }

        for(int c = 0 ; c < board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c] = true;
                queens(board, r+1);
                board[r][c] = false;
            }
        }
    }
        public static void display(boolean[][] board) {
            for(boolean[] r : board){
                for(boolean element : r){
                    if(element) {
                        System.out.print("Q");
                    }
                    else{
                        System.out.print("X");
                    }
                }
                System.out.println();
            }
        }
        public static boolean isSafe(boolean[][] board, int r, int c) {
            for(int i = 0; i< r;i++){
                if(board[i][c]){
                    return false;
                }
            }
            int maxleft = Math.min(r, c);
            for(int i = 1; i<=maxleft;i++){
                if(board[r-i][c-i]){
                    return false;
                }
            }
                int maxright = Math.min(r, board.length - c -1);
                for(int i = 1; i<=maxright;i++){
                    if(board[r-i][c+i]){
                        return false;
                    }    
            
        }
        return true;
    }    
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board= new boolean[n][n];
        queens(board, 0);
    }
}
