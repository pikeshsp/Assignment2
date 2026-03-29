package Assignment5.Module13;

class Node4 {
    int data;
    Node left, right;

    Node4(int value) {
        data = value;
        left = right = null;
    }
}

public class CheckBST {

    // Function to check BST using range
    boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        CheckBST tree = new CheckBST();

        // Creating a binary tree
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("The tree is a valid BST");
        else
            System.out.println("The tree is NOT a BST");
    }
}