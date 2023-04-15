public class CountNumberOfSubset {

    public static int countSubset (int [] arr, int diff) {

        int sumArr = 0;
        for(int i =0; i<arr.length; i++) {
            sumArr += arr[i]; 
        }
        int sum =0;

        sum = (diff + sumArr)/2;

        return countSubsetSum(arr,sum);

    }

    public static int countSubsetSum (int[] arr, int sum) {

        int n = arr.length;
        int[][] t = new int [n+1][sum+1];

        for(int i = 0; i<= n; i++){
            t[i][0] = 1; 
        }

        for(int i = 1; i<= sum; i++){
            t[0][i] = 0; 
        }

        for(int i = 1; i<=n; i++) {
            for(int j =1; j<= sum; j++){
                if(arr[i-1] <= j) {
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int diff = 1;
        System.out.println(countSubset(arr,diff));
    }
}
