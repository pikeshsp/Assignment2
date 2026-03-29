package Assignment5.Module12;

class Node2 {
    int data;
    Node left, right;

    Node2(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePostorder {

    // Postorder Traversal (Left → Right → Root)
    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        BinaryTreePostorder tree = new BinaryTreePostorder();

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Postorder Traversal:");
        tree.postorder(root);
    }
}