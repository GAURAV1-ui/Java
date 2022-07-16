public class exCuteInstruction {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int [s.length()];
        
        
        
        int m =0;
        while(s.length()>0){
        int count = 0;
        int u = startPos[0];
        int r = startPos[1];
        for(int i = 0 ; i<s.length() ; i++){
            if (s.charAt(i) == 'R' && r < n-1){
                r++;
                count++;
                
            }
             else if (s.charAt(i) == 'L' && r > 0){
                r--;
                count++;
            }
             else if (s.charAt(i) == 'U' && u>0){
                u--;
                count++;
            }
             else if (s.charAt(i) == 'D' && u < n-1){
                u++;
                count++;
            }
            else{
                break;
            }
            
            
            
        }
        ans [m] = count;
        m++;
        s = s.substring(1, s.length());
            
    }
        return ans;
    
    }
   public static void main(String[] args) {

    int n = 3;
    int[] startPos = {0,1};
    String s = "RRDDLU";
    System.out.println(executeInstructions(n, startPos, s));
    
   } 
}
