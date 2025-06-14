class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class tree {
    Node root;

    public void travels(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            travels(node.left);
            travels(node.right);
        }
    }

    public static void main(String[] args) {
        tree tree = new tree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        System.out.println("\nBinary Tree");
        tree.travels(tree.root);

    }
}
