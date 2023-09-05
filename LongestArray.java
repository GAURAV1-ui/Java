public class LongestArray {
    public static int alternatingSubarray(int[] nums) {
        int i =0;
        int j =0;
        int n = nums.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j<n) {
            
            if(j<2) {
                j++;
            }
            if(j>=2) {
                if(nums[i] == nums[j]) {
                    count++;
                     max = Math.max(count,max);
                } else {
                   
                    count = 0;
                }
                i++;
                j++;
            }
            
        }
        
        return max+2;
}
public static void main(String [] args) {
    int [] nums = {2,3,4,3,4};
    System.out.println(alternatingSubarray(nums));
}
}
