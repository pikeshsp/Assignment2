package Assignment5.Module13;

class Node3 {
    int data;
    Node left, right;

    Node3(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTDeletion {

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

    // Find minimum value (used in deletion)
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Delete function
    Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two children
            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }

        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BSTDeletion tree = new BSTDeletion();

        // Creating BST
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Before Deletion:");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 50);

        System.out.println("\nAfter Deletion:");
        tree.inorder(tree.root);
    }
}