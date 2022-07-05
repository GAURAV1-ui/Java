public class QuickSort {
    public static int partition(int arr[], int low, int high) {
      int pivot = arr[low];

      int cnt = 0;
      for(int i=low+1;i<=high;i++){
        if(arr[i]<=pivot){
            cnt++;
        }
      }
      int pivotIdx = cnt + low;

      int temp = arr[low];
      arr[low] = arr[pivotIdx];
      arr[pivotIdx] = temp;

      int i = low; 
      int j = high;
      while(i < pivotIdx && pivotIdx < j){
        
        while(arr[i]<pivot){
            i++;
        }
        while (arr[j]>pivot){
            j--;
        }
        if(i < pivotIdx && pivotIdx < j){
            int temp1 = arr[i];
            arr[i] = arr [j];
            arr [j] = temp1;
            i++;j--;
        }
      }
      return pivotIdx;
    }
    public static void quickSort (int arr[], int low, int high){
     if(low>=high){
        return;
     }

        int piv = partition(arr, low, high);
        quickSort(arr, low, piv-1);
        quickSort(arr, piv+1, high);
    
    }
    public static void main (String[] args) {
        int[] arr = {5,4,3,6,2,7};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
