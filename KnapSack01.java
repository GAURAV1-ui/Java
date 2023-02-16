import java.util.*;

public class KnapSack01 { 
    public static int KnapSack(int[] wt, int [] val,int[][] t, int w, int n) {
        if(n == 0 || w == 0){
            return 0;
        }
        for (int[] row : t){
        Arrays.fill(row, -1);
        }
    
    
       if(t[n][w] != -1){
        return t[n][w];
       }
    
        if(wt[n-1] <=w){
            return t[n][w] = Math.max(KnapSack(wt, val, t, w-wt[n-1], n-1),
            KnapSack(wt, val, t, w, n-1));
        }
        else if(wt[n-1]<w){
            return t[n][w] = KnapSack(wt, val, t, w, n-1);
        }
    }


    public static void main(String args[]) {
        int [] w= {1,2,3,1,2,8,5};
        int [] val = {10,20,30,10,80,20,100};
        int weight = 7;
        int [][] t = new int [100][1000];
        int n = w.length;
        
        int max = KnapSack(w, val, t,weight,n);
        System.out.println(max);
    }
}
