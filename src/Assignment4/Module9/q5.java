package Assignment4.Module9;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}
public class q5 {
    Node4 head = null;
    void add(int data) {
        Node4 newNode = new Node4(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    int count() {
        int count = 0;
        Node4 temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        q5 list = new q5();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int total = list.count();
        System.out.println("Number of nodes: " + total);
    }
}
