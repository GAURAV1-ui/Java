
public class energyFrogNeedToJump {
    public static int FrogJump( int[] ener, int n) {
        int dp [] = new int [n];
        dp[0] = 0;

        for(int i =1; i<n; i++) {
            int ss = dp[i-1] + Math.abs(ener[i] - ener[i-1] );
            int ls = 0;
            if(i>1) {
                ls =  dp[i-2] + Math.abs(ener[i] - ener[i-2]) ;
            }
            dp[i] = Math.min(ss,ls);
        }

        return dp[n-1];
    }
    public static void main(String [] args) {
        int [] ener = {30,10,60,10,60,50};
        int n = 6;
        System.out.println(FrogJump(ener, n));
    }
}
