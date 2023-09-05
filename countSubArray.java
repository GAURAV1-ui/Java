import java.util.HashSet;

public class countSubArray {

    public static int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                set.add(num);
            }
            int ans = 0;
            
            for(int i =0; i<nums.length; i++) {
                HashSet<Integer> set1 = new HashSet<>();
                for(int j =i; j<nums.length; j++) {
                    set1.add(nums[j]);
                    if(set.size() == set1.size()) {
                        ans++;
                    }
                }
            }
            
            return ans;
    }
    public static void main( String [] args) {
        int [] nums = {1,3,1,2,2};

        System.out.println(countCompleteSubarrays(nums));
    }
}
