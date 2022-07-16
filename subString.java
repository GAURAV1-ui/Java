import java.util.*;
public class subString {
 static List<List<Integer>> subset (int[] arr) {
    List<List<Integer>> outer = new ArrayList<List<Integer>>();

    outer.add(new ArrayList<Integer>());

    for(int i = 0; i < arr.length; i++) {
        int size = outer.size();
        for(int j = 0; j < size; j++) {
            List<Integer> inner = new ArrayList<Integer>(outer.get(j));
            inner.add(arr[i]);
            outer.add(inner);
        }
    }
    return outer;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer>list : ans)
        System.out.println(list);
    }
}
