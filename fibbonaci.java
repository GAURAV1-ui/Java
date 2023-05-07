import java.util.Arrays;

public class fibbonaci {

    public static int Fibbonaci(int n) {
        if(n<=1) {
            return n;
        }

        int [] dp = new int [n+1];
        Arrays.fill (dp,-1); 

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = Fibbonaci(n-1) + Fibbonaci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fibbonaci(6));
    }
}
