package Assignment5.Module13;

class Node2 {
    int data;
    Node left, right;

    Node2(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTMinMax {

    Node root;

    // Insert function
    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    // Find Minimum
    int findMin(Node root) {
        if (root == null)
            throw new RuntimeException("Tree is empty");

        while (root.left != null)
            root = root.left;

        return root.data;
    }

    // Find Maximum
    int findMax(Node root) {
        if (root == null)
            throw new RuntimeException("Tree is empty");

        while (root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args) {

        BSTMinMax tree = new BSTMinMax();

        // Creating BST
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Minimum element: " + tree.findMin(tree.root));
        System.out.println("Maximum element: " + tree.findMax(tree.root));
    }
}