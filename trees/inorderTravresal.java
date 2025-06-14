class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class inorderTravresal {
    Node root;

    public void travels(Node node) {
        if (node != null) {
            travels(node.left); 
            System.out.print(node.data + " "); 
            travels(node.right); 
        }
    }

    public static void main(String[] args) {
        inorderTravresal tree = new inorderTravresal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Binary Tree (Inorder Traversal):");
        tree.travels(tree.root);
    }
}
