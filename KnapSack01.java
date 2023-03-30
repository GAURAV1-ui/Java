import java.util.*;

public class KnapSack01 { 
    public static int KnapSack(int[] wt, int [] val, int w, int n) {
        if(n == 0 || w == 0){
            return 0;
        }
        // for (int[] row : t){
        // Arrays.fill(row, -1);
        // }
    
    
        if(wt[n-1] <=w){
            return Math.max(val[n-1] + KnapSack(wt, val, w-wt[n-1], n-1),
            KnapSack(wt, val, w, n-1));
        }
        else{
            return KnapSack(wt, val, w, n-1);
        }

    }


    public static void main(String args[]) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = wt.length;
        int max = KnapSack(wt, val,W,n);
        System.out.println(max);
    }
}
