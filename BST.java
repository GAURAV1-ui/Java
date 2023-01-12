public class BST {

    // BST inorder
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        }

        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ "");
        inorder(root.right);

    }

    public static boolean Search(Node root, int key) {
        if(root == null){
            return false;
        }
        if(root.data > key) {
            return Search(root.left, key);
        }
        else if(root.data == key) {
            return true;
        }
        else {
             return Search(root.right, key);
        }
        
    }
   public static void main(String args[]) {
    int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
    Node root = null;  
    
    for(int i=0; i< values.length; i++){
        root = insert(root, values[i]);
    }

    inorder(root);
    System.out.println();

    if(Search(root,7)){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }
   } 
}
