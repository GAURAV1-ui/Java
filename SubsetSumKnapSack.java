public class SubsetSumKnapSack {

    public static boolean SubsetSum (int [] arr, int sum, int n) {
        if(sum == 0){
            return true;
        }

        if(n == 0) {
            return false;
        }

        if(arr[n-1]<= sum){
            return SubsetSum(arr, sum-arr[n-1], n-1) || SubsetSum(arr, sum, n-1);
        } else {
            return SubsetSum(arr, sum, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30 };
        int sum = 50;
        int n = arr.length;
        // SubsetSum(arr,sum,n);
        if (SubsetSum(arr, sum, n) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
    }
}
