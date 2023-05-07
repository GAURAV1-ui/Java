public class cuttingRod {
    public static int cutRod(int price[], int n) {

		int [] arr = new int[n];

		for(int i=1; i<=n; i++) {
			arr[i-1] = i;
		}

		int [][] t = new int[n+1][n+1];

		// for (int[] num: t)
    	// 	Arrays.fill(num, -1);

		
		for(int i=0;i<=n;i++) {
			t[i][0] =0;
		}
		for(int i=1;i<=n;i++) {
			t[0][i] =0;
		}

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {

				if(arr[i-1]<=j){
					t[i][j] = Math.max(price[i-1]+ 
					t[i-1][j-arr[i-1]], t[i-1][j]);
				} else {
					t[i][j] = t[i-1][j];
				}
			} 
		}
		return t[n][n];
	}

    public static void main(String args[]) {
        int [] price = {2,5,7,8,10};
        int n = 5;

        System.out.println(cutRod(price, n));
    }
}