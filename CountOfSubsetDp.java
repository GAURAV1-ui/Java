public class CountOfSubsetDp {
    public static int countSubset1(int[] arr, int n, int sum) {
        int res[][] = new int [n+1][sum+1];

        for(int i = 1; i<=sum; i++){
            res[0][i] = 0;
    }
        for(int i = 0; i<=n; i++){
            res[i][0] = 1;
        }

        for(int i =1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1] <= j) {
                    res[i][j] = res[i-1][j-arr[i-1]] + res[i-1][j];
                } else {
                    res[i][j] = res[i-1][j];
                }
            }
        }
        return res[n][sum];
    }

    public static void main (String[] args) {
        int [] arr = {2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int sum = 10;
        System.out.println(countSubset1(arr, n, sum));
    }
}
