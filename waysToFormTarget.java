public class waysToFormTarget {
    public static int numWays(String[] words, String target) {

        String word = "";
        
        for(int i =0; i< words.length; i++) {
            word += words[i];
        }
    
        int count = 0;
        int n = word.length();
        String temp = "";
        return subString(word,n, target, temp, count);
    }
    
    public static int subString (String word, int n, String target, String temp, int count){

        if(n == 0){
            if(temp.equals(target)){
                ++count;
            }
            System.out.println(temp);
            return 0;
        }
    
            subString (word ,n-1, target, temp + word.charAt(n-1), count);
            subString (word ,n-1, target, temp, count);

            return count;
        }
    
        public static void main(String args[]) {
            String [] words = {"a", "b", "c"};
            String target = "a";
    
            System.out.println(numWays(words, target));
            
        }
}
