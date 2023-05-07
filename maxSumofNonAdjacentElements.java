import java.util.Arrays;

public class maxSumofNonAdjacentElements {

    public static int MaxSum(int[] arr, int n, int[] dp) {
        // if(n == 0) {
        //     return arr[n];
        // }

        // if(n < 0) {
        //     return 0;
        // }
        // if(dp[n] != -1) {
        //     return dp[n];
        // }

        // int pick = arr[n] + MaxSum(arr, n-2, dp);
        // int notPick = 0 + MaxSum(arr, n-1, dp);

        // return dp[n] = Math.max(pick, notPick);
        dp[0] = arr[0];
        // int neg = 0;

        for(int i =1; i< n; i++) {
            int take = arr[i];
            if(i > 1){
                take += dp[i-2];
            }
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n-1];


    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,9};
        int n = arr.length;
        int[] dp = new int [n];
        Arrays.fill(dp, -1);
        System.out.println(MaxSum(arr,n-1, dp));
    }
}
