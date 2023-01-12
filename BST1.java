public class BST1 {
   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static void InOrder(Node root) {
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static Node Delete(Node root, int val) {
        if(root.data > val){
           root.left = Delete(root.left, val);
        }
        else if(root.data < val){
            root.right = Delete(root.right, val);
        }
        else{
            if(root.right == null && root.left == null){
                return null;
            }

            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }

            Node Is = inOrderSuccessor(root.right);
            root.data = Is.data;
            root.right = Delete(root.right, Is.data);
        }
        return root;
        }

        public static Node inOrderSuccessor(Node root) {
            while(root.left != null){
                root.left = inOrderSuccessor(root.left); 
            }
            return root;
        }
    public static void main(String args[]) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
    Node root = null;  
    
    for(int i=0; i< values.length; i++){
        root = insert(root, values[i]);
    }
    InOrder(root);
    System.out.println();

    Delete(root, 5);
    InOrder(root);
    }
    
}
