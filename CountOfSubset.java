public class CountOfSubset {

    public static int countSubset(int[] arr, int n, int sum){
        if(n == 0 ){
            return 0;
        } if(sum == 0){
            return 1;
        }

        if (n==0 && sum==0)
        return 1;

        if(arr[n-1]<= sum){
            return countSubset(arr, n-1, sum-arr[n-1]) + countSubset(arr, n-1, sum);
        }else {
            return countSubset(arr, n-1, sum);
        }
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int sum = 10;
        System.out.println(countSubset(arr, n, sum));
    }
}
