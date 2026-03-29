package Assignment5.Module13;

class Node1 {
    int data;
    Node left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTSearch {

    Node root;

    // Insert function (to build BST)
    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    // Search function
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (key == root.data)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        BSTSearch tree = new BSTSearch();

        // Creating BST
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        int key = 40;

        if (tree.search(tree.root, key))
            System.out.println("Key found in BST");
        else
            System.out.println("Key not found in BST");
    }
}