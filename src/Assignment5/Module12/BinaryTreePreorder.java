package Assignment5.Module12;

class Node1{
    int data;
    Node left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePreorder {

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        BinaryTreePreorder tree = new BinaryTreePreorder();

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        tree.preorder(root);
    }
}
