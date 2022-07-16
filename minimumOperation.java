import java.util.Arrays;
public class minimumOperation {
    public static int [] minimumOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        
        int right = 0;
        int count = 0;
        
        for(int i =0; i< boxes.length(); i++){
            if(boxes.charAt(i)== '1'){
                count +=i;
                right++;
            }
        }
            Arrays.fill(ans,count);
            
            int left = 0;
            for(int j=0;j<boxes.length()-1;j++){
                if(boxes.charAt(j)== '1'){
                    left++;right--;
                    int temp = ans[j] - right + left;
                    ans[j+1] = temp;
                }
                else {
                   int temp = ans[j] - right + left;
                    ans[j+1] = temp; 
                }
            }
        
    return ans;
    }
    
    public static void main(String[] args) {
        String boxes = "110";
        minimumOperations(boxes); 
    }
}
