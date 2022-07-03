public class MergeSort {

    public static void mergeSort (int arr[], int s, int e){
        if (s >= e){
            return;
        }
            int m = s+(e-s)/2;
            mergeSort(arr, s, m);
            mergeSort(arr, m+1, e);
            merge(arr, s, m, e);

    }
    public static void merge(int arr[], int s, int m, int e) {
        int merged[] = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;

        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                merged[k] = arr[i];
                i++;
            }
            else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j<=e){
            merged[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<merged.length; l++){
            arr[s+l] = merged[l];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
