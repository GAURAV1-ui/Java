public class MaxArea {
    public static int maxArea(int[] height) {
        int curr_streak = 0;
        int long_streak = 0;
        
        int start = 0;
        int end = height.length-1;
        
        while(start<=end){
            if(height[start]<= height[end]){
                curr_streak = height[start]*(end-start);
                start++;
            }
            else{
                curr_streak = height[end]*(end-start);
                end--;
            }
            long_streak = Math.max(curr_streak,long_streak);
            curr_streak = 0;
        }
        return long_streak;
    }
        
    
    public static void main(String[] args ) {
        int [] height = {3,9,3,4,7,2,12,6};
        System.out.println(maxArea(height));
    }
}
