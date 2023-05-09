import java.util.*;

public class maxFallingPath {

    public static int MaxFallingPath(int[][] path) {
        
        int n = path.length;
        int m = path[0].length;
        int[][] dp = new int [n][m];

        for (int[] row: path)
        Arrays.fill(row, -1);

        int max = Integer.MIN_VALUE-1;
        for(int i =0; i<m; i++) {
            max = Math.max(max, maxPath(path,n-1,i,dp));
        }

        return max;
    }

    public static int maxPath(int[][] path, int i, int j, int[][]dp) {
        if(j<0 || j>= path[0].length) return Integer.MIN_VALUE-1;
        if(i == 0) {
            return path[0][j];
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int u = path[i][j] + maxPath(path, i-1, j,dp);
        int r = path[i][j] + maxPath(path, i-1, j-1, dp);
        int l = path[i][j] + maxPath(path, i-1, j+1, dp);

        return dp[i][j] = Math.max(u, Math.max(r,l));
    }

    public static void main(String[] args) {
        int [][] path= {{1,2,10,4}, {100,3,2,1},{1,1,20,2},{1,2,2,1}};
        System.out.println(MaxFallingPath(path));  
    }
}
