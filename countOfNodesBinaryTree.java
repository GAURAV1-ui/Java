public class countOfNodesBinaryTree {
    static class Node {
        int data;
        Node left, right;
    
        Node(int data) {
          this.data = data;
          this.left = null;
          this.right = null;
        }
       }
       
       static class BinaryTree {
          static int idx = -1;
          public static Node buildTree(int nodes []) {
             idx++;
             if(nodes[idx] == -1){
                return null;
             }
             Node newNode = new Node(nodes[idx]);
             newNode.left = buildTree(nodes);
             newNode.right = buildTree(nodes);
    
             return newNode;
          }
       }

       public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
       } 
       public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = sumNodes(root.left);
        int rightNodes = sumNodes(root.right);

        return leftNodes + rightNodes + root.data;
       } 

       public static int heightNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightNodes(root.left);
        int rightHeight = heightNodes(root.right);
        int ans = Math.max(leftHeight,rightHeight)+1;
        return ans;
       } 

       public static int diameterNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameterNodes(root.left);
        int rightDia = diameterNodes(root.right);
        int midDia = heightNodes(root.left) + heightNodes(root.right)+1 ;
        return Math.max(midDia, Math.max(leftDia,rightDia));
    
       }
       public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(countNodes(root));
        System.out.println(sumNodes(root));
        System.out.println(heightNodes(root));
        System.out.println(diameterNodes(root));
       } 
}
