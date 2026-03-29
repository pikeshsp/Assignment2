package Assignment5.Module12;

class Node3 {
    int data;
    Node left, right;

    Node3(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    // Function to find height
    int height(Node root) {
        if (root == null)
            return -1;  // use 0 if counting nodes instead of edges

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height of Binary Tree: " + tree.height(root));
    }
}
