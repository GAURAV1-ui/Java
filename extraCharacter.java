import java.util.*;

public class extraCharacter {

    static int[] memo;
    static HashSet<String> dictionarySet;

    public static int extraChar(String s, String[] dictionary) {
        int n = s.length();
        memo = new int[n];
        dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        return dp(0, n, s);
    }

    private static int dp(int start, int n, String s) {
        if (start == n) {
            return 0;
        }

        if (memo[start] != 0) {
            return memo[start];
        }

        int ans = dp(start + 1, n, s) + 1;

        for (int end = start; end < n; end++) {
            String curr = s.substring(start, end + 1);
            if (dictionarySet.contains(curr)) {
                 ans = Math.min(ans, dp(end + 1, n, s));
            }
        }


        return memo[start] = ans;
    }


        public static void main(String[] args) {
            String s = "leetscode";
            String [] d = {"leet","code","leetcode"};

            System.out.println(extraChar(s, d)); 
        }
}
