public class factorial {

    public static int solve(int n) {
        if(n ==0) return 1;

        return solve(n-1)*n;
    }
public static void main(String[] args) {
    System.out.println(solve(5));
}
}
