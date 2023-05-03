import java.util.*;

public class maxValueOfKinCoins {
    public static int maxValueOfCoins(List<List<Integer>> piles, int k) {

        int max =  Integer.MIN_VALUE;

        for (int i = 0; i<piles.size(); i++) {
            int temp = 0;
            for (int j = 0; j<k; j++) {
                temp += piles.get(i).get(j);    
            }
                max = Math.max(max,temp);
        }

        return max;
    }

    public static void main(String[] args) {
        List<List<Integer> > listOfLists
            = new ArrayList<List<Integer> >();

        List<Integer> list1
            = new ArrayList<Integer>();
        list1.add(1);
        list1.add(100);
        list1.add(3);
        listOfLists.add(list1);
  
        List<Integer> list2
            = new ArrayList<Integer>();
        list2.add(7);
        list2.add(8);
        list2.add(9);
        listOfLists.add(list2);

        int k =2;
        System.out.println(maxValueOfCoins(listOfLists, k));
        
    }
}
