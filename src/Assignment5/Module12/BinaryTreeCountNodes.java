package Assignment5.Module12;

class Node4 {
    int data;
    Node left, right;

    Node4(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeCountNodes {

    // Function to count nodes
    int countNodes(Node root) {
        if (root == null)
            return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {

        BinaryTreeCountNodes tree = new BinaryTreeCountNodes();

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Total number of nodes: " + tree.countNodes(root));
    }
}