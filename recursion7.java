
    public class recursion7 {
        public static int printSum(int x,int n) {
            if(n==0){
            return 1;
             }
             if(x==0){
                 return 0;
             }
            if(n%2==0){
                return printSum(x,n/2)*printSum(x,n/2);
            }else{
                return printSum(x,n/2) * printSum(x,n/2)*x;
            }
    
        
        
            
        }
        public static void main(String args[]) {
            int x=3, n=4;
          int ans =  printSum(x,n);
            System.out.println(ans);
             
        } 
        
    }
