import java.util.*;

public class maximumSwap {
    public static int MaximumSwap(int num) {
        List <Integer> list =  new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count_min = 0;
        int count_max = 0;
        int ans = 0;
        int n = num;

        while(num > 0) {
            int temp = num%10;
            list.add(temp);
            num = num/10;
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max) {
                max = list.get(i);
                count_max = i;
            }
            if(list.get(i) < min) {
                min = list.get(i);
                count_min = i;
            }
        }

         Collections.swap(list,count_min,count_max);

         for(int i=list.size()-1; i>=0; i--){
             ans = ans*10 + list.get(i);
         }
         return Math.max(ans,n);
    }

    public static void main(String[] args) {
        int num = 2736;
        System.out.println(MaximumSwap(num));
    }
}
