public class equalPartition {

    public static boolean equalPartition1 (int[] arr, int n) {
        
        int sum =0;
        for(int i =0; i<n; i++){
            sum = sum+arr[i];
        }
        if(sum%2 != 0){
            return false;
        } else{
           return subsetSum(arr, sum/2,n );
        }
    }

    public static boolean subsetSum (int[] arr, int sum, int n) {

        if(n == 0) {
            return false;
        }
        if(sum == 0){
            return true;
        }

        if(arr[n-1] <= sum ){
            return subsetSum(arr, sum-arr[n-1], n-1) || subsetSum(arr, sum, n-1);
        }else {
           return subsetSum(arr, sum, n-1);
        }
    }


    public static void main(String[] args) {
         int arr[] = new int[] {5,1,4,14};
         int n = arr.length;
         if(equalPartition1(arr,n)){
            System.out.print("true");
         }else{
            System.out.println("false");
         }
    }

}