package Assignment4.Module9;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class q2 {
    Node1 head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node1 newNode = new Node1(data);

        newNode.next = head; // Link new node to current head
        head = newNode;      // Update head to new node
    }

    void display() {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        q2 list = new q2();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Linked List after insertion at beginning:");
        list.display();
    }
}
