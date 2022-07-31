import java.util.ArrayList;
import java.util.List;

public class twoSumCombination {
        public static void combinationSum(int[] candidates, int target) {
            ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(); 
            backtrack(candidates,0,target,new ArrayList<Integer>(), res);
            System.out.println(res);
        }
            
            public static void backtrack(int[] candidates,int start,int target,List<Integer> list,  List<List<Integer>> res){
                if(target < 0){
                    return;
                }
                if(target == 0){
                    res.add(list);
                }
                for(int i = start; i<candidates.length; i++){
                    list.add(candidates[i]);
                   backtrack(candidates,i,target-candidates[i],list, res); 
                    list.remove(list.size()-1);
                }
            }
            public static void main(String[] args) {
                int [] candidates = {2,3,6,7};
                int target = 7;
                 combinationSum(candidates, target);
            }
        }

