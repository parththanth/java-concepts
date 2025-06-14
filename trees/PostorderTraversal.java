class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class PostorderTraversal {
    Node root;

    public void travels(Node node) {
        if (node != null) {
            travels(node.left);               
            travels(node.right);              
            System.out.print(node.data + " "); 
        }
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Binary Tree (Postorder Traversal):");
        tree.travels(tree.root);
    }
}
