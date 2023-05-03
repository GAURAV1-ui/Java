import java.util.*;

public class differenceOf2Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<List<Integer>> list
            = new ArrayList<List<Integer>>();
            List<Integer> list1
            = new ArrayList<Integer>();
        List<Integer> list2
            = new ArrayList<Integer>();

        for(int num : nums1) {
            set1.add(num);
        }
         for(int num : nums2) {
            set2.add(num);
        }

     for(int num : nums2) {
            if(!set1.contains(num)){
                list1.add(num);
            }
        }
        list.add(list1);

    for(int num : nums1) {
            if(!set2.contains(num)){
                list2.add(num);
            }
        }
        list.add(list2);

        return list;
}
public static void main(String [] args) {
    int[] nums1 = {1,2,3};
    int[] nums2 = {2,4,6};
    System.out.println(findDifference(nums1, nums2));
}

}
