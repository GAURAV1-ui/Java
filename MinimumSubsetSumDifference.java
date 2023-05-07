
public class MinimumSubsetSumDifference {

    public static int minimumSubsetSum(int[] arr,int n){
        int range = 0;

        for(int i =0 ; i<n; i++) {
            range = range+arr[i];
        }

        // int[] res = n

        boolean subset[][] = new boolean[n + 1][range + 1];
        
        for(int i =0;i<=n; i++){
            subset[i][0] = true;
        }

        for(int i =1;i<=range; i++){
            subset[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= range; j++) {
                if (j < arr[i - 1])
                    subset[i][j] = subset[i - 1][j];
                if (j >= arr[i - 1])
                    subset[i][j] = subset[i - 1][j]
                                   || subset[i - 1][j - arr[i - 1]];
            }
        }


        int mn = Integer.MAX_VALUE;

            for(int i = range/2; i>=0; i--){
                 if(subset[n][i]){
                    mn = range - 2*i;
                    break;
                 }
            }

            return mn;
        
    }

    public static void main (String[] args){
        int[] arr = {3, 1, 4, 2, 2, 1 };
        int n = arr.length;
        System.out.println(minimumSubsetSum(arr,n));
        
    }
}
