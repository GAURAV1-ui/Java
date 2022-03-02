public class recursion4{
    public static int printSum(int n,int sum) {
        if(n==0){
     System.out.println(sum);
        return 1;
         }
         sum *= n;     
    
   
    return printSum(n-1,sum);
    
    
        
    }
    public static void main(String args[]) {
        printSum(5,1);
         
    }  

    
}
