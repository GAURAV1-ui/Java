public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2 ) {
        int [] arr = new int [nums1.length+nums2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
             arr[k] = nums1[i];
                i++;
                k++;
        }
         while(j<nums2.length){
              arr[k] = nums2[j];
                j++;
                k++;
         }
        int mid = arr.length/2;
        double ans = 0;
        
        if(mid%2 == 0){
            ans = (arr[mid-1] + arr [mid])/2; 
        }
        else{
            ans = arr[mid];
        }
       return ans;     
    }
    
    
    public static void main (String[] args){
       int[] nums1 = {1,2}; 
       int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
       
    }
}
