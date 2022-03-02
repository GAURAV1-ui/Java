public class recursion6 {
    public static int printSum(int x,int n) {
        if(n==0){
        return 1;
         }
         if(x==0){
             return 0;
         }
             
    
   
    int p =printSum(x,n-1);
    int y = p*x;
    return y;

    
    
        
    }
    public static void main(String args[]) {
        int x=3, n=2;
      int ans =  printSum(x,n);
        System.out.println(ans);
         
    } 
    
}
