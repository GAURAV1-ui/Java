import java.util.HashSet;
import java.util.Set;

public class twoSumBst {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

     public static boolean findTarget(TreeNode root, int k) {
        return util(root, k, new HashSet<>());
    }
    
    private static boolean util(TreeNode root, int k, Set<Integer> set) {
        if(root==null) {
            return false;
        }
        
        if(set.contains(k-root.val)) {
            return true;
        }
        set.add(root.val);
        return util(root.left, k, set)||util(root.right, k, set);
    }
    
}
