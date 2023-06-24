import java.util.HashSet;

public class MaximumNumberStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        
        int count = 0;
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i =1; i<words.length; i++) {
            
            String temp = words[i].substring(1) + words[i].substring(0,1);
            if(set.contains(temp)) {
                count++;
            } else {
                set.add(words[i]);
            }
        }
        
        return count;
    }

    public static void main (String [] args) {
        String [] str = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(str));
    }
}
