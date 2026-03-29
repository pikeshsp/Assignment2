package Assignment5.Module12;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeInorder {

    // Inorder Traversal (Left → Root → Right)
    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeInorder tree = new BinaryTreeInorder();

        // Creating binary tree manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        tree.inorder(root);
    }
}