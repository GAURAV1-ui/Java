import java.util.Arrays;

public class totalCuts {
    public static int TotalCuts(int N, int K, int[] A) {
        Arrays.sort(A);
        int count = 0;
        int n = N-1;
        while(n>0) {
            if(A[n] + A[n-1]>= K) {
                count++;
            }
            n--;
        }
        
        return count;
    }

    public static void main (String [] args) {
        int [] A= {1,2,3};
        int K= 3;
        int N =3;
        System.out.println(TotalCuts(N, K, A));
    }
}
