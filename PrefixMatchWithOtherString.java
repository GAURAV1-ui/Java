public class PrefixMatchWithOtherString {
    public static int klengthpref(String[] arr, int n, int k, String str)
    {
        str = str.substring(0,k);
        int count = 0;
        for(int i =0 ; i<arr.length; i++) {
           String temp = arr[i].substring(0,k);
            if(str.equals(temp)){
                count++;
            }
        }
        return count;
    }

    public static void main( String[] args) {
        int n = 6;
        String[] arr = {"abba","abbb","abbc","abbd","abaa", "abca"};
        String str = "abbg";
        int k = 3;
        System.out.println(klengthpref(arr, n, k, str));
    }
}
