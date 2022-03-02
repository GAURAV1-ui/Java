public class recursion {
    public static int printNumb(int n) {
        if(n==0){
            return 0;
        }
        System.out.println(n);
       return printNumb(n-1);   
    }
    public static void main(String args[]) {
     int n = 5;
     printNumb(n);       
    }
    
}
