package Assignment4.Module9;

class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class q3 {
    static Node2 head = null;
    public void display() {//traversal in ll;
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void addLast(int data) {
        Node2 newNode = new Node2(data);//new node will be created becs it calls constuctor;
        if (head == null) {
            head = newNode;
            return;//WILL NOT CJECK FURTHER;
        }
        Node2 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void main(String[] args) {
        q3 list = new q3();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
    }
}
