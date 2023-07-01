public class fairDistributionOfCookies {
        static int ans = Integer.MAX_VALUE;

    public static void helper(int[] cookies, int start, int k, int[] temp) {
        if (start == cookies.length) {
            int max = 0;
            for (int c : temp)
                max = Math.max(max, c);
            ans = Math.min(ans, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            temp[i] += cookies[start];
            helper(cookies, start + 1, k, temp);
            temp[i] -= cookies[start];
        }
    }

    public static int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, k, new int[k]);
        return ans;
    }

    public static void main (String [] args) {
        int[] cookies = {6,1,3,2,2,4,1,2};
        int k = 3;

        System.out.println(distributeCookies(cookies,k));
    }
}
