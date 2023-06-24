public class longestCommonSubsequence {

    public static String LongestCommonSubsequence(String text1, String text2) {
        
    int [][] dp = new int[text1.length()+1][text2.length()+1];
    longestSubs(text1,text2, text1.length(),text2.length(),dp);

    int i = text1.length();
    int j = text2.length();
    String str = "";
    while(i >0 && j >0) {
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            str += text1.charAt(i-1);
            i--;
            j--;
        } else {
            if(dp[i][j-1] > dp[i-1][j]) {
                j--;
            } else{
                i--;
            }
        }
    }
    str = rotateStr(str);
    int k = 0;
    int a = 0;
    String res = "";
    

    while(text2.length()-1 >= k) {
        if(text2.charAt(k) == str.charAt(a)) {
            k++;
            a++;
        } else {
            res += text2.charAt(k);
            k++;
        }
    }

    res = res+text1;
    System.out.println(res);
    return res;

}

public static String rotateStr(String str) {
    String ans = "";
    int n = str.length()-1;
    while(n>=0) {
        ans += str.charAt(n);
        n--;
    }

    return ans;
}
    public static int longestSubs(String text1,String text2, int  n, int m, int[][] dp){
     if(n ==0 || m == 0) {
         return 0;
     }

    //  if(dp[n][m] != -1) {
    //      return dp[n][m];
    //  }

    for(int i=0; i<=n; i++) {
        dp[i][0] = 0;
    }

    for(int i=0; i<=m; i++) {
        dp[0][i] = 0;
    }

        for(int i =1; i<=n; i++) {
            for(int j =1; j<=m; j++) {
                   if(text1.charAt(i-1) == text2.charAt(j-1)) {

                    dp[i][j] = 1 + dp[i-1][j-1] ;
     }
        else{
                dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]);
        }
            }
        }
        return dp[n][m];
  
 }

    public static void main(String [] args) {
        String a = "abac";
        String b = "cab";

        System.out.print(LongestCommonSubsequence(a, b));
    }
}
