package Assignment4.Module9;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
public class q4 {
    Node3 head = null;

    // Insert at end (for testing)
    void add(int data) {
        Node3 newNode = new Node3(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node3 temp = head;
        Node3 prev = null;

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        prev.next = temp.next;
    }
    void display() {
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        q4 list = new q4();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.display();

        list.delete(20);

        System.out.println("After Deletion:");
        list.display();
    }
}
