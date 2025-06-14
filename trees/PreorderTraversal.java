class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class PreorderTraversal {
    Node root;

    public void travels(Node node) {
        if (node != null) {
            System.out.print(node.data + " "); 
            travels(node.left);
            travels(node.right); 
        }
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Binary Tree (Preorder Traversal):");
        tree.travels(tree.root);
    }
}
