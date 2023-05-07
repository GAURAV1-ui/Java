public class frogJump2 {
    public static int FrogJump( int[] ener, int n) {
        int dp [] = new int [n];
        dp[0] = 0;
        int minSteps = Integer.MAX_VALUE;

        for(int i =1; i<n; i++) {
            for(int j = 1; j < n; j++){
            int ls =0;
            if(i-j>= 0) {
                ls =  dp[i-j] + Math.abs(ener[i] - ener[i-j]) ;
                minSteps = Math.min(minSteps,ls);
            }
            dp[i] = minSteps;
        }
       
    }

        return dp[n-1];
    }
    public static void main(String [] args) {
        int [] ener = {30,10,60,10,35,70};
        int n = 6;
        System.out.println(FrogJump(ener, n));
    }
}
