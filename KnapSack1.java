import java.util.*;

public class KnapSack1 { 

    public static int KnapSack(int[] wt, int [] val, int w, int n) {
        int k[][] = new int[n + 1][w + 1];
        for (int[] row : k){
            Arrays.fill(row, -1);
        }

        if(n == 0 || w == 0){
            return 0;
        }
        if(k[n][w] != -1) {
            return k[n][w];
        }
    
        if(wt[n-1] <=w){
            return k[n][w] = Math.max(val[n-1] + KnapSack(wt, val, w-wt[n-1], n-1),
            KnapSack(wt, val, w, n-1));
        }
        else if(wt[n-1] > w){
            return k[n][w] = KnapSack(wt, val, w, n-1);
        }

        return k[n][w];

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